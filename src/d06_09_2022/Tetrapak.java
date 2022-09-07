package d06_09_2022;

public class Tetrapak extends Ambalaza {
	private boolean daLiSeReciklira;
	private double osnovnaCena;

	public boolean isDaLiSeReciklira() {
		return daLiSeReciklira;
	}

	public void setDaLiSeReciklira(boolean daLiSeReciklira) {
		this.daLiSeReciklira = daLiSeReciklira;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiSeReciklira,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.daLiSeReciklira = daLiSeReciklira;
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSeReciklira = true) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}

	@Override
	public void print() {
		System.out.println(this.nazivArtikla);
		System.out.println("Sa barkodom " + this.barkod);
		System.out.println("Sa tezinom " + this.tezinaPakovanja());
		System.out.print("Tetrapak");
		if (this.daLiSeReciklira = true) {
			System.out.println(" je od recikliranog materijala");
		} else {
			System.out.println(" nije od recikliranog materijala");
		}
		System.out.println("Cena " + this.nazivArtikla + " je " + this.cenaArtikla());
	}

}
