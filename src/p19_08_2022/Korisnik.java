package p19_08_2022;

public class Korisnik {
	private String ime;
	private String prezime;
	private String email;

//	default konstruktor
	public Korisnik() {
	}

//	konstruktor sa parametrima
	public Korisnik(String i, String p, String e) {
		this.ime = i;
		this.prezime = p;
		this.email = e;
	}

	public Korisnik(String ime) {
		this.ime = ime;
	}

	public void print() {
		System.out.println("Ime: " + this.ime);
	}

//	public void setNazivAtributa(TipAtributa nazivAtributa){
//	this.NazivAtributa = nazivAtributa;
//	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return this.ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public String getEmail() {
		return this.email;
	}

}
