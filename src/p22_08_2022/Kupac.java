package p22_08_2022;

public class Kupac {
	private String fullName;
	private ClanskaKarta clanskaKarta;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}

	public Kupac(String fullName, ClanskaKarta clanskaKarta) {
		this.fullName = fullName;
		this.clanskaKarta = clanskaKarta;
	}

	public void print() {
		System.out.println(this.fullName + " - " + clanskaKarta.getBrojKartice());
	}

}
