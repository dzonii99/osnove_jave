package p19_08_2022;

public class Radnik {
	private String jmbg;
	private String imeIPrezime;
	private int brDece;
	private int stepenStruke;
	private int godineStaza;

	public void print() {
		System.out.println("Ime i prezime: " + this.imeIPrezime);
		System.out.println("JMBG: " + this.jmbg);
		System.out.println("Broj dece: " + this.brDece);
		System.out.println("Stepen struke: " + this.stepenStruke + " stepen");
		System.out.println("Godine staza: " + this.godineStaza + " godine/a");
	}

	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}

	public Radnik(String imeIPrezime, String jmbg, int brDece, int stepenStruke, int godineStaza) {
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brDece = brDece;
		this.stepenStruke = stepenStruke;
		this.godineStaza = godineStaza;
	}

	public String getJmbg() {
		return this.jmbg;

	}

	public String getImeIPrezime() {
		return this.imeIPrezime;
	}

	public int getBrDece() {
		return this.brDece;
	}

	public int getGodineStaza() {
		return this.godineStaza;
	}

	public int getStepenStruke() {
		return this.stepenStruke;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void setBrDece(int brDece) {
		this.brDece = brDece;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public void setStepenStruke(int stepenStruke) {
		this.stepenStruke = stepenStruke;
	}

	public double minuliRad() {
		double m = 0;
		if (this.godineStaza <= 10) {
			return m = 0.05;
		} else if (this.godineStaza <= 20) {
			return m = 0.0075;
		} else if (this.godineStaza > 20) {
			return m = 0.1;
		}
		return 0;
	}

	public double koeficijentSlozenosti() {
		if (this.stepenStruke == 1) {
			return 1.03;
		} else if (this.stepenStruke == 2) {
			return 1.65;
		} else if (this.stepenStruke == 3) {
			return 2;
		} else if (this.stepenStruke == 4) {
			return 2.27;
		} else if (this.stepenStruke == 5) {
			return 2.88;
		} else if (this.stepenStruke == 6) {
			return 3.09;
		} else if (this.stepenStruke == 7) {
			return 3.40;
		} else if (this.stepenStruke == 8) {
			return 4.12;
		}
		return 0;
//		double k = 1.0;
//		switch (this.stepenStruke) {
//		case 1:
//			k = 1.03;
//			break;
//		case 2:
//			k = 1.65;
//			break;
//		case 3:
//			k = 2.00;
//			break;
//		case 4:
//			k = 2.27;
//			break;
//		case 5:
//			k = 2.88;
//			break;
//		case 6:
//			k = 3.09;
//			break;
//		case 7:
//			k = 3.40;
//			break;
//		case 8:
//			k = 4.12;
//			break;
//		}
//
//		return k;
	}

	public double plata() {
		return 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
	}

	public boolean kreditnoSposoban() {
		if (this.plata() > 50000) {
			return true;
		} else {
			return false;
		}
	}

}
