package d18_08_2022;

public class SmartAirConditioning {
	public String marka;
	public double potrosnjaCold;
	public double potrosnjaHot;
	public int temperatura;
	public boolean mod;

	public void print() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + "°C.");
	}

	public double potrosnjaMesec() {
		double potrosnja;
		if (this.mod == false) {
			return potrosnja = 30 * 15 * this.potrosnjaCold;
		} else {
			return potrosnja = 30 * 15 * this.potrosnjaHot;
		}
	}

	public double potrosnjaNovac() {
		double ukupnaCena;
		if (this.potrosnjaMesec() <= 350) {
			return ukupnaCena = this.potrosnjaMesec() * 6;
		} else {
			return ukupnaCena = (350 * 6) + (this.potrosnjaMesec() - 350) * 9;
		}
	}

}
