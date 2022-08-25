package d22_08_2022;

public class Knjiga {
	private String isbn;
	private String naziv;
	private int godina;
	private Autor autor;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Knjiga(String isbn, String naziv, int godina, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;
		this.autor = autor;
	}

	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godina + " god");
//		System.out.println("Autor: " + autor.getIme() + " " + autor.getPrezime());
		System.out.print("Autor: ");
		autor.print();
	}

}
