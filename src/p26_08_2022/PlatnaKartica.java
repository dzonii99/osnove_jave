package p26_08_2022;

public class PlatnaKartica {
	protected double trenutnaSuma;
	protected String brojKartice;
	protected int godinaIsteka;
	protected int mesecIsteka;

	public PlatnaKartica(double trenutnaSuma, String brojKartice, int godinaIsteka, int mesecIsteka) {
		super();
		this.trenutnaSuma = trenutnaSuma;
		this.brojKartice = brojKartice;
		this.godinaIsteka = godinaIsteka;
		this.mesecIsteka = mesecIsteka;
	}

	public double getTrenutnaSuma() {
		return trenutnaSuma;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public int getGodinaIsteka() {
		return godinaIsteka;
	}

	public int getMesecIsteka() {
		return mesecIsteka;
	}

	public void dodajSredstva(double iznos) {
		this.trenutnaSuma += iznos;
	}

	public void izvrsiTransakciju(double iznos) {
		this.trenutnaSuma -= iznos;
	}

	public void print() {
		System.out.println(
				this.brojKartice + ", " + this.mesecIsteka + "/" + this.godinaIsteka + ", " + this.trenutnaSuma + "$");
	}

}
