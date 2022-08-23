package p23_08_2022;

public class ViberPoruka {
	private String text;
	private String vreme;
	private ViberKorisnik posiljalac;
	private ViberKorisnik primalac;
	private ViberReakcija reakcija;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public ViberKorisnik getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(ViberKorisnik posiljalac) {
		this.posiljalac = posiljalac;
	}

	public ViberKorisnik getPrimalac() {
		return primalac;
	}

	public void setPrimalac(ViberKorisnik primalac) {
		this.primalac = primalac;
	}

	public ViberReakcija getReakcija() {
		return reakcija;
	}

	public void setReakcija(ViberReakcija reakcija) {
		this.reakcija = reakcija;
	}

//	public ViberPoruka(String text, String vreme, ViberKorisnik posiljalac, ViberKorisnik primalac,
//			ViberReakcija reakcija) {
//		this.text = text;
//		this.vreme = vreme;
//		this.posiljalac = posiljalac;
//		this.primalac = primalac;
//		this.reakcija = reakcija;
//	}
	public ViberPoruka(String text) {
		this.text = text;
	}

	public void reakcija() {
		if (this.reakcija != null) {
			System.out.print(this.reakcija.getEmoji() + " from " + this.reakcija.getReagovao().getFullName());
		} else {
			System.out.print("Bez reakcija");
		}

	}

	public void print() {
		if (this.posiljalac.isAktivnost() == true) {
			System.out.println("From: " + this.posiljalac.getFullName() + "* at " + this.vreme);
			System.out.println("To: " + this.primalac.getFullName());
			System.out.print(this.text + " : ");
			this.reakcija();

		}
		if (this.posiljalac.isAktivnost() == false) {
			System.out.println("From: " + this.posiljalac.getFullName() + "- at " + this.vreme);
			System.out.println("To: " + this.primalac.getFullName());
			System.out.print(this.text + " : ");
			this.reakcija();
		}
	}
}
