package p05_09_2022;

public class Dodatak {
	private String naziv;
	private int cena;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public Dodatak(String naziv, int cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public void stampaj() {
		System.out.println(this.naziv + " " + this.cena + "rsd");
	}

}
