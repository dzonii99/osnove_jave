package p26_08_2022;

public class VisaKartica extends PlatnaKartica {
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public VisaKartica(int trenutnaSuma, String brojKartice, int godinaIsteka, int mesecIsteka, String fullName) {
		super(trenutnaSuma, brojKartice, godinaIsteka, mesecIsteka);
		this.fullName = fullName;
	}

	private double racunajProviziju(double iznos) {
		double provizija = iznos * 0.018;
		return provizija < 4 ? 4 : provizija;
//		uslov ? vrednostZaTrue : vrednostZaFalse;

//		double provizija = iznos *0.018;
//		if(provizija<4) {
//			return 4;
//		}
//		return provizija;
	}

	@Override
	public void izvrsiTransakciju(double iznos) {
		this.trenutnaSuma = this.trenutnaSuma - iznos - this.racunajProviziju(iznos);
	}

	@Override
	public void print() {
		System.out.print("Visa Card: ");
		super.print();
	}

}
