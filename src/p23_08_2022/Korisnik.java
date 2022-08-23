package p23_08_2022;

public class Korisnik {
	private String fullName;
	private String tip;

	public Korisnik() {
		this.tip = "basic";
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTip() {
		return tip;
	}

	public void pretplati(int uplata) {
		if (uplata == 100) {
			this.tip = "pro";
		} else if (uplata == 150) {
			this.tip = "premium";
		}
	}

	public void ponistiPretplatu() {
		this.tip.equals("basic");
	}

	public int maksDuzinaTrajanja() {
		if (this.tip.equals("basic")) {
			return 40;
		} else if (this.tip.equals("pro")) {
			return 240;
		} else if (this.tip.equals("premium")) {
			return 1440;
		}
		return 0;
	}

	public void print() {
		System.out.println(this.fullName);
	}

}
