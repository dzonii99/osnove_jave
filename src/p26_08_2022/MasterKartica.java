package p26_08_2022;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(int trenutnaSuma, String brojKartice, int godinaIsteka, int mesecIsteka, String fullName) {
		super(trenutnaSuma, brojKartice, godinaIsteka, mesecIsteka);
	}

	@Override
	public void izvrsiTransakciju(double iznos) {
		double provizija = 1.5 / 100.0 * iznos;
		this.trenutnaSuma = this.trenutnaSuma - iznos - provizija;
	}

	public void naplatiOdrzavanje() {
		this.trenutnaSuma -= 2;
	}

	@Override
	public void print() {
		System.out.print("Master Card: ");
		super.print();
	}

}
