package d26_08_2022;

public class Osoba {
	protected String fullName;
	protected String jmbg;
	protected int godinaRodjenja;

	public Osoba() {
		super();
	}

	public Osoba(String fullName, String jmbg, int godinaRodjenja) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg + ", " + this.godinaRodjenja);
	}

}
