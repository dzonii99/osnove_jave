package p05_09_2022;

public class VisaKartica extends PlatnaKartica {

	public VisaKartica(double suma, String brojKartice, int godina, int mesec) {
		super(suma, brojKartice, godina, mesec);
		// TODO Auto-generated constructor stub
	}

	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	private double racunajProviziju(double iznos) {
		double provizija = iznos * 0.018;
		return provizija < 4 ? 4 : provizija;
	}

	@Override
	public void izvrsiTransakciju(double vrednost) {
		this.suma -= vrednost - this.racunajProviziju(vrednost);
	}

	@Override
	public void print() {
		System.out
				.println("Visa Card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);

	}

}
