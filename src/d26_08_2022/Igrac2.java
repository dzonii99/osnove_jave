package d26_08_2022;

import java.util.ArrayList;

public class Igrac2 extends Osoba {
	private int brojNaDresu;
	private String pozicija;
	ArrayList<Karton> nizKartona = new ArrayList<Karton>();
	private boolean kapiten;

	public Igrac2() {
		super();
	}

	public Igrac2(String fullName, String jmbg, int godRodj, int brojNaDresu, String pozicija) {
		super(fullName, jmbg, godRodj);
		this.brojNaDresu = brojNaDresu;
		this.pozicija = pozicija;
	}

	public int getBrojNaDresu() {
		return brojNaDresu;
	}

	public void setBrojNaDresu(int brojNaDresu) {
		this.brojNaDresu = brojNaDresu;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void dodajKarton(Karton k) {
		this.nizKartona.add(k);
	}

	public int zutiKartoni() {
		int brojac = 0;
		for (int i = 0; i < nizKartona.size(); i++) {
			if (this.nizKartona.get(i).getTip().equals("zuti"))
				brojac++;
		}
		return brojac;
	}

	public int crveniKartoni() {
		int brojac = 0;
		for (int i = 0; i < nizKartona.size(); i++) {
			if (this.nizKartona.get(i).getTip().equals("crveni"))
				brojac++;
		}
		return brojac;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Igrac sa brojem " + this.brojNaDresu + " na poziciji " + this.pozicija);
		if (this.isKapiten() == true) {
			System.out.println("Ovaj igrac je kapiten.");
		}
		System.out.println(
				"Igrac ima " + this.zutiKartoni() + " zutih kartona i " + this.crveniKartoni() + " crveni karton");
		System.out.println();
	}

}
