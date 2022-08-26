package p26_08_2022;

public class Kamion extends Vozilo {
	private int nosivost;

	public Kamion() {

	}

	public Kamion(String registracija, String marka, int brzina, int kubikaza, int maxBrzina, int nosivost) {
		super(registracija, marka, brzina, kubikaza, maxBrzina);
		this.nosivost = nosivost;
	}

//	public void stampajKamion() {
//		this.stampaj();
//		System.out.println("Nosivost: " + this.nosivost);
//	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Nosivost: " + this.nosivost);
	}
}
