package p05_09_2022;

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
		System.out.println("Reg: " + this.registracija);
		System.out.println("Marka: " + this.marka);
		System.out.println("Brzina: " + this.brzina);
		System.out.println("Kubikaza: " + this.kubikaza);
		System.out.println("Max brzina: " + this.maxBrzina);
		System.out.println("Nosivost: " + this.nosivost);
	}
}
