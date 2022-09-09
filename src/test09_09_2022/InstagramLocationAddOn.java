package test09_09_2022;

public class InstagramLocationAddOn extends InstagramAddOn {
	private String nazivLokacije;

	public InstagramLocationAddOn(int id, int x, int y, String nazivLokacije) {
		super(id, x, y);
		this.nazivLokacije = nazivLokacije;
	}

	public String getNazivLokacije() {
		return nazivLokacije;
	}

	public void setNazivLokacije(String nazivLokacije) {
		this.nazivLokacije = nazivLokacije;
	}

	@Override
	public int minSirina() {
		return 100;
	}

	@Override
	public int minVisina() {
		return 50;
	}

	@Override
	public void print() {
		System.out.println("[" + this.x + ", " + this.y + "] (" + this.visinaDodatka + ", " + this.sirinaDodatka
				+ ") L " + this.nazivLokacije);

	}

}
