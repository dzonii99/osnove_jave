package p06_09_2022;

public abstract class Atleticar {
	private String fullName;
	protected double rezultat;

	public Atleticar(String fullName, double rezultat) {
		super();
		this.fullName = fullName;
		this.rezultat = rezultat;
	}

	public String getFullName() {
		return fullName;
	}

	public double getRezultat() {
		return rezultat;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//	string x;
//	string y;
//	x.equals(y);
//	a1.daLiJeBolji(a2);
	public abstract boolean koJeBolji(Atleticar atleta);

	public void print() {
		System.out.println(this.fullName + ", " + this.rezultat);
	}

}
