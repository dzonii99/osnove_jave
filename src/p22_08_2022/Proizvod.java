package p22_08_2022;

public class Proizvod {
	private String naziv;
	private Kupac kupac;
	private int cenaIzrade;
	private ClanskaKarta kartica;

	public Proizvod(String naziv, Kupac kupac, int cenaIzrade, ClanskaKarta kartica) {
		this.naziv = naziv;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
		this.kartica = kartica;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public int getCenaIzrade() {
		return cenaIzrade;
	}
	public void setCenaIzrade(int cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}
	public ClanskaKarta getKartica() {
		return kartica;
	}
	public void setKartica(ClanskaKarta kartica) {
		this.kartica = kartica;
	}
	public double cenaProizvoda() {
		return this.cenaIzrade * 1.9*(100.0-kupac.getClanskaKarta().getPopust())/100;
	}
	public void print() {
		System.out.println(this.naziv + " - " + this.cenaProizvoda() + " RSD");
		kupac.print();
	}

}
