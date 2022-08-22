package p22_08_2022;

public class FacebookPost {
	private String text;
	private Korisnik autor;

	public FacebookPost(String text, Korisnik autor) {
		this.text = text;
		this.autor = autor;
	}

	public void print() {
		System.out.println(autor.ime + " " + autor.prezime);
		System.out.println(this.text);
	}

}
