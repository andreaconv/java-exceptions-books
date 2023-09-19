package org.lessons.java.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static final String FILE_PATH = "C:\\Users\\admin\\Documents\\BOOLEAN\\JAVA\\progetti\\java-exceptions-books\\src\\org\\lessons\\java\\books\\books.txt";
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String titolo = null;
		int numPagine = 0;
		String autore = null;
		String editore = null;
		
		//LUNGHEZZA
		System.out.print("Digitare la QUANTITÀ di libri che si vogliono inserire ");
		
//		mi salvo il numero inserito
//		int LNG = sc.nextInt();
//		sc.nextLine();
		
		//ALTERNATIVA che converte una stringa in numero
		int LNG = Integer.valueOf(sc.nextLine());
		
		Libro[] libri = new Libro[LNG];
		
		for (int i = 0; i < LNG; i++) {
			
			try {
				
				System.out.print("Inserire il titolo: ");
				titolo = sc.nextLine();
				
				System.out.print("Inserire il numero di pagine: ");
				numPagine = Integer.valueOf(sc.nextLine());
				
				System.out.print("Inserire l'autore: ");
				autore = sc.nextLine();
				
				System.out.print("Inserire l'editore: ");
				editore = sc.nextLine();
				
				libri[i] = new Libro(titolo, numPagine, autore, editore);
				
			} catch (Exception e) {
				
				System.err.println("Dato inserito errato: " + e.getMessage());
				
				i--;
			}			
		}
		sc.close();
		
		System.out.println("\n-----------------------------------------\n");
		
		FileWriter myWriter = null;
		try {
			
//			myWriter = new FileWriter("filename.java.out");
			//PROVE PERCORSO
//			myWriter = new FileWriter("books.txt");
//			myWriter = new FileWriter("./books.txt");
			//percorso giusto alla stessa altezza delle calssi
			myWriter = new FileWriter(FILE_PATH, true);
			
			//STAMPA DELL'ARRAY
			System.err.println("LIBRI APPENA INSERITI =");
			for (int i = 0; i < LNG; i++) {
				
				myWriter.write(libri[i] + "\n");
				System.out.println("Libro " + (i + 1) + " = " + libri[i]);
			}
			System.out.println("\n-------------------------------------------\n");
			
		} catch (IOException e) {
			
			System.out.println("Error updating file: " + e.getMessage());
		} finally {
			
			try {
				myWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//lettura del file
		File tmpFile = new File(FILE_PATH);
		Scanner reader = null;
		try {
					
			reader = new Scanner(tmpFile);
			
			System.err.println("LIBRI DAL FILE =");
			
			while (reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) { 
		
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null)
				reader.close();
		}
		
		
		
	}

}
