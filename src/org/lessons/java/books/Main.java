package org.lessons.java.books;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String titolo = null;
		int numPagine = 0;
		String autore = null;
		String editore = null;
		
		System.out.print("Digitare la quantità di libri che si vogliono inserire ");
		int LNG = sc.nextInt();
		sc.nextLine();
		
		Libro[] libri = new Libro[LNG];
		
		for (int i = 0; i < LNG; i++) {
			
			System.out.print("Inserire il titolo: ");
			titolo = sc.nextLine();
			System.out.print("Inserire il numero di pagine: ");
			numPagine = sc.nextInt();
			sc.nextLine();
			System.out.print("Inserire l'autore: ");
			autore = sc.nextLine();
			System.out.print("Inserire l'editore: ");
			editore = sc.nextLine();
			
			libri[i] = new Libro(titolo, numPagine, autore, editore);
			
		}
		
		for (int i = 0; i < LNG; i++) {
			
			System.out.println("Libro " + (i + 1) + " = " + libri[i]);
			
		}
		
		
		
	}

}
