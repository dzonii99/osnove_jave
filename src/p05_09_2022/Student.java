package p05_09_2022;

public abstract class Student {
	protected String fullName;
	protected int brojIndeksa;
	protected int godinaStudija;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public Student(String fullName, int brojIndeksa, int godinaStudija) {
		super();
		this.fullName = fullName;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
	}

	public abstract int cenaSkolarine();

	public abstract boolean budzet();

	public void print() {
		System.out.println(this.fullName + ", " + this.brojIndeksa + ", " + this.godinaStudija);
		System.out.print("Finansiranje: ");
		if (this.budzet() == true) {
			System.out.println(" budzet");
		} else {
			System.out.println(" samofinansiranje");
		}
		System.out.println("Cena skolarine: " + this.cenaSkolarine());
	}
}
