package p23_08_2022;

public class Ugovor {
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}

	public double procenatZarade() {
		if (kupac.isKupljenJednom() == true) {
			return 0.02;
		} else {
			return 0.03;
		}
//		return this.kupac.isKupljenJednom() ? 0.02 : 0.03;
	}

	public double zaradaAgencije() {
		return 1000 + this.cena * this.procenatZarade();

	}

	public void print() {
		System.out.println("Dana " + this.datum + "god sklopljen je ugovor izmedju ");
		this.prodavac.print();
		System.out.print(" i ");
		this.kupac.print();
		System.out.println(" o kupovini nekretnine " + this.adresa);
		System.out.println(" po ceni od " + this.cena + "$"
				+ " pri cemu je kupac u obavezi da agenciji ispalti novcanu vrednost u iznosu od "
				+ this.zaradaAgencije() + "$");
	}

}
