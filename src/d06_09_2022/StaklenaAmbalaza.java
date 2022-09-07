package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija,
			boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSePlacaKaucija = true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}

	}

	@Override
	public void print() {
		System.out.println(this.nazivArtikla);
		System.out.println("Sa barkodom " + this.barkod);
		System.out.println("Sa tezinom " + this.tezinaPakovanja());
		System.out.print("Za ambalazu");
		if (this.daLiSePlacaKaucija = true) {
			System.out.println(" se placa kaucija");
			System.out.println("Cena " + this.nazivArtikla + " je " + this.cenaArtikla() + " sa kaucijom");
		} else {
			System.out.println(" se ne placa kaucija");
			System.out.println("Cena " + this.nazivArtikla + " je " + this.cenaArtikla());
		}

	}

}
