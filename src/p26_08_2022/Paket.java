package p26_08_2022;

public class Paket {
	protected String nazivPaketa;
	protected String fullName;
	protected int mesecnaCena;
	protected int ugovornaObaveza;
	protected int brzinaNetDownload;
	protected int brzinaNetUpload;

	public Paket(String nazivPaketa, String fullName, int mesecnaCena, int ugovornaObaveza, int brzinaNetDownload,
			int brzinaNetUpload) {
		super();
		this.nazivPaketa = nazivPaketa;
		this.fullName = fullName;
		this.mesecnaCena = mesecnaCena;
		this.ugovornaObaveza = ugovornaObaveza;
		this.brzinaNetDownload = brzinaNetDownload;
		this.brzinaNetUpload = brzinaNetUpload;
	}

	public String getNazivPaketa() {
		return nazivPaketa;
	}

	public String getFullName() {
		return fullName;
	}

	public int getMesecnaCena() {
		return mesecnaCena;
	}

	public int getUgovornaObaveza() {
		return ugovornaObaveza;
	}

	public int getBrzinaNetDownload() {
		return brzinaNetDownload;
	}

	public int getBrzinaNetUpload() {
		return brzinaNetUpload;
	}

	public void produziUgovor() {
		this.ugovornaObaveza += 12;
	}

	public int brojMeseciZaDinar() {
		return 0;
	}

	public void print() {
		System.out.println(this.fullName);
		System.out.println(this.nazivPaketa + " - " + this.brzinaNetDownload + "/" + this.brzinaNetUpload + " - "
				+ this.ugovornaObaveza);
		System.out.print(this.mesecnaCena);
	}

}
