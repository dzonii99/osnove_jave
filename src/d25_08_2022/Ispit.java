package d25_08_2022;

public class Ispit {
	private String naziv;
	private int ocena;
	private String fullNameProf;

	public Ispit(String naziv, int ocena, String fullNameProf) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.fullNameProf = fullNameProf;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getFullNameProf() {
		return fullNameProf;
	}

	public void setFullNameProf(String fullNameProf) {
		this.fullNameProf = fullNameProf;
	}

	public boolean ispitPolozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println(this.naziv + " - " + this.fullNameProf + " - " + this.ocena);
	}

}
