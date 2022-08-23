package d22_08_2022;

public class Autor {
	private String ime;
	private String prezime;

	public Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void print() {
		System.out.println(this.ime + " " + this.prezime);
	}

}
