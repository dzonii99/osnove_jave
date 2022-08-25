package d23_08_2022;

public class Ringla {
	private String tip;
	private int jacina;
	private double grejac;

	public Ringla(String tip, double grejac) {
		this.tip = tip;
		this.grejac = grejac;
		this.jacina = 0;
	}

	public int getJacina() {
		return jacina;
	}

	private int maxBrojPojacavanja() {
		if (this.tip.equals("obicna")) {
			return 3;
		} else {
			return 12;
		}
	}

	public void pojacajRinglu() {
		if (this.jacina > this.maxBrojPojacavanja()) {
			this.jacina = this.maxBrojPojacavanja();
		} else {
			this.jacina += 1;
		}
	}

	public void iskljuciRinglu() {
		this.jacina = 0;
	}

	public boolean radRingle() {
		if (this.jacina > 0) {
			return true;
		} else {
			return false;
		}
	}

	public double potrosnja(int brojSati) {
		return (100 / this.maxBrojPojacavanja()) * this.jacina * this.grejac * brojSati;
	}

	public void print() {
		System.out.println("Ringla je ");
		if (this.radRingle() == true) {
			System.out.print("ukljucena!");
		} else {
			System.out.print("iskljucena.");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.grejac + " kW");
	}

}
