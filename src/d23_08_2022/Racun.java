package d23_08_2022;

public class Racun {
	private String brojRacuna;
	private String fullName;
	private double stanje;

	public Racun(String brojRacuna, String fullName, int stanje) {
		this.brojRacuna = brojRacuna;
		this.fullName = fullName;
		this.stanje = stanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getStanje() {
		return stanje;
	}

	public void menjaStanje(double vrednost) {
		if (this.stanje + vrednost >= 0) {
			this.stanje += vrednost;
		}
	}

	public void print() {
		System.out.println(this.fullName + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanje + " RSD");
	}

}
