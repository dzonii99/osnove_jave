package d26_08_2022;

public class Igrac extends Osoba {
	private int brojNaDresu;
	private String pozicijuKojuIgra;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(String fullName, String jmbg, int godinaRodjenja, int brojNaDresu, String pozicijuKojuIgra) {
		super(fullName, jmbg, godinaRodjenja);
		this.brojNaDresu = brojNaDresu;
		this.pozicijuKojuIgra = pozicijuKojuIgra;
	}

	public int getBrojNaDresu() {
		return brojNaDresu;
	}

	public void setBrojNaDresu(int brojNaDresu) {
		this.brojNaDresu = brojNaDresu;
	}

	public String getPozicijuKojuIgra() {
		return pozicijuKojuIgra;
	}

	public void setPozicijuKojuIgra(String pozicijuKojuIgra) {
		this.pozicijuKojuIgra = pozicijuKojuIgra;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Igrac sa brojem: " + this.brojNaDresu);
		System.out.println("Igrac je: " + this.pozicijuKojuIgra);
		if (this.kapiten == true) {
			System.out.println("Igrac je kapiten tima!");
		}

	}

}
