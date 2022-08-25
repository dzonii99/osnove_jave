package d23_08_2022;

public class ZeleniKarton {
	private String fullNameStudent;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String fullNameProf;
	private int ocena;

	public ZeleniKarton(String fullNameStudent, int brojIndeksa, String nazivPredmeta, String fullNameProf, int ocena) {
		this.fullNameStudent = fullNameStudent;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.fullNameProf = fullNameProf;
		this.ocena = ocena;
	}

	public String getFullNameStudent() {
		return fullNameStudent;
	}

	public void setFullNameStudent(String fullNameStudent) {
		this.fullNameStudent = fullNameStudent;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getFullNameProf() {
		return fullNameProf;
	}

	public void setFullNameProf(String fullNameProf) {
		this.fullNameProf = fullNameProf;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public int getOcena() {
		return ocena;
	}

	public boolean ispit() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.fullNameStudent + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.fullNameProf);
		System.out.println();
	}

}
