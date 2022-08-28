package d26_08_2022;

public class Trener extends Osoba {
	private int godineIskustva;
	private String tipTrenera;

	public Trener() {
		super();
	}

	public Trener(String fullName, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(fullName, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void print() {
		super.print();
		if (this.godineIskustva == 0) {
			System.out.println("Trener je bez iskustva");
		} else {
			System.out.println("Trener ima " + this.godineIskustva + "god iskustva");
		}
		System.out.println("On/ona je " + this.tipTrenera + " trener");
	}

}
