package d22_08_2022;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;

	public Vaga() {
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu(double tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return tezina * proizvod.getCenaKg();
		} else if (this.mernaJedinica.equals("lb")) {
			return tezina * proizvod.getCenaLb();
		}
		return 0;
	}

	public void print(double tezina) {
		proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " din/" + this.mernaJedinica + " x " + tezina);
		}
		if (this.mernaJedinica.equals("lb")) {
			System.out.println(proizvod.getCenaLb() + " din/" + this.mernaJedinica + " x " + tezina);
		}
		System.out.println("Ukupno: " + this.sracunajCenu(tezina) + "din");

	}

}
