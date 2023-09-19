package org.lessons.java.books;

public class Libro {
	
	private String titolo;
	private int numPagine;
	private String autore;
	private String editore;
	
	
	public Libro(String titolo, int numPagine, String autore, String editore) throws Exception {

		setTitolo(titolo);
		setNumPagine(numPagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	//TITOLO
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		
		if (titolo.isBlank())
			throw new Exception("Title can't be empty");
		this.titolo = titolo;
	}
	
	//NUMPAGINE
	public int getNumPagine() {
		return numPagine;
	}
	public void setNumPagine(int numPagine) throws Exception {
		
		if (numPagine <= 0)
			throw new Exception("Number of pages can't be 0 or less");
		this.numPagine = numPagine;
	}
	
	//AUTORE
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		
		if (autore.isBlank())
			throw new Exception("Author can't be empty");
		this.autore = autore;
	}
	
	//EDITORE
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) throws Exception  {
		
		if (editore.isBlank())
			throw new Exception("Publisher can't be empty");
		this.editore = editore;
	}
	

	@Override
	public String toString() {
		return "titolo: " + getTitolo() + " | numero pagine: " + getNumPagine() + " | autore: " + getAutore() + " | editore: " + getEditore();
	}
	

}
