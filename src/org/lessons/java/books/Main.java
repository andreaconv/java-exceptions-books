package org.lessons.java.books;

import java.util.Scanner;

public class Main {
	
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
		
		for (int i = 0; i < LNG; i++) {
			
			System.out.println("Libro " + (i + 1) + " = " + libri[i]);
			
		}
		
		
		
	}

}
