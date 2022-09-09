package test09_09_2022;

public class InstagramMentionAddOn extends InstagramAddOn {
	private InstagramUser koJeTagovan;

	public InstagramMentionAddOn(int id, int x, int y, InstagramUser koJeTagovan) {
		super(id, x, y);
		this.koJeTagovan = koJeTagovan;
	}

	public InstagramUser getKoJeTagovan() {
		return koJeTagovan;
	}

	public void setKoJeTagovan(InstagramUser koJeTagovan) {
		this.koJeTagovan = koJeTagovan;
	}

	@Override
	public int minSirina() {
		return 80;
	}

	@Override
	public int minVisina() {
		return 50;
	}

	@Override
	public void print() {
		System.out.print("[" + this.x + ", " + this.y + "] (" + this.visinaDodatka + ", " + this.sirinaDodatka + ")");
		System.out.println(" @" + this.koJeTagovan.getUsername() + "/" + this.koJeTagovan.generiseLink());

	}

}
