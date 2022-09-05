package p05_09_2022;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
		super(suma, brojKartice, godina, mesec);
	}

	@Override
	public void izvrsiTransakciju(double vrednost) {
		double provizija = 1.5 / 100 * vrednost;
		this.suma -= vrednost - provizija;

	}

	public void naplatiOdrzavanje() {
		this.suma -= 2;
	}

	@Override
	public void print() {
		System.out
				.println("Master Card: " + this.mesec + "/" + this.godina + ", " + this.brojKartice + ", $" + this.suma);

	}

}
