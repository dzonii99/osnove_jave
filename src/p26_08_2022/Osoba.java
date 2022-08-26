package p26_08_2022;

public class Osoba {
	protected String fullName;
	protected String jmbg;

	public Osoba(String fullName, String jmbg) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
	}

	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg);
	}

}
