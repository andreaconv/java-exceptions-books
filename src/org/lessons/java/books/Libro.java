package org.lessons.java.books;

public class Libro {
	
	private String titolo;
	private int numPagine;
	private String autore;
	private String editore;
	
	
	public Libro(String titolo, int numPagine, String autore, String editore) {

		setTitolo(titolo);
		setNumPagine(numPagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	//TITOLO
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	//NUMPAGINE
	public int getNumPagine() {
		return numPagine;
	}
	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}
	
	//AUTORE
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	//EDITORE
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	

	@Override
	public String toString() {
		return "titolo: " + titolo + " | numero pagine: " + numPagine + " | autore: " + autore + " | editore: " + editore;
	}
	

}
