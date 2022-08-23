package p23_08_2022;

public class FizickoLice {
	private String fullName;
	private String brojLicneKarte;
	private String jmbg;
	private boolean kupljenJednom;

	public FizickoLice(String fullName, String brojLicneKarte, String jmbg) {
		this.fullName = fullName;
		this.brojLicneKarte = brojLicneKarte;
		this.jmbg = jmbg;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}

	public boolean isKupljenJednom() {
		return kupljenJednom;
	}

	public void setKupljenJednom(boolean kupljenJednom) {
		this.kupljenJednom = kupljenJednom;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void print() {
		System.out.print(this.fullName + ", " + this.brojLicneKarte);
	}

}
