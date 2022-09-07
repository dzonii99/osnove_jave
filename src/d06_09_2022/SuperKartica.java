package d06_09_2022;

public class SuperKartica {
	private String brojKartice;
	private String fullNameVlasnika;
	private int popust;

	public SuperKartica(String brojKartice, String fullNameVlasnika, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.fullNameVlasnika = fullNameVlasnika;
		this.popust = popust;
	}

	public SuperKartica() {
		super();
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public String getFullNameVlasnika() {
		return fullNameVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void stampaj() {
		System.out.println(this.brojKartice + ", " + this.fullNameVlasnika);
	}

}
