package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String fullName;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Radnik(String fullName) {
		super();
		this.fullName = fullName;
	}

	public abstract double plata();

	public void zaposli(Sektor sektor) {
		sektori.add(sektor);
	}

}
