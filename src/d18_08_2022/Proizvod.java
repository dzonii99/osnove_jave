package d18_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezina;

	public void print() {
		System.out.println(
				"Uzeli ste " + this.naziv + ", koji kosta " + this.cena + "RSD, sa tezinom " + this.tezina + "g.");
	}

	public void povecajCenu(int povecanje) {
		this.cena += povecanje;
	}

	public double vratiCenuSaPopustom(double popust) {
		double cenaSaPopustom;
		if (popust > 0 || popust <= 100) {
			return cenaSaPopustom = this.cena - this.cena * (popust / 100);
		} else {
			return 0;
		}
	}

	public int racunajPostarinu() {
		int postarina = 0;
		if (this.tezina <= 100) {
			return postarina = 200;
		} else if (this.tezina <= 500) {
			return postarina = 400;
		} else {
			return postarina = 1000;
		}
	}

}
