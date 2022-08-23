package p23_08_2022;

public class ViberKorisnik {
	private String fullName;
	private String brojTelefona;
	private boolean aktivnost;

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ViberKorisnik(String fullName, String brojTelefona) {
		this.fullName = fullName;
		this.brojTelefona = brojTelefona;
	}

	public String getFullName() {
		return fullName;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public boolean isAktivnost() {
		return aktivnost;
	}

	public void setAktivnost(boolean aktivnost) {
		this.aktivnost = aktivnost;
	}

}
