package p26_08_2022;

public class DUOPaket extends Paket {
	private String uredjaj;

	public DUOPaket(String fullName, int mesecnaCena, int ugovornaObaveza, String uredjaj) {
		super("EON FULL DUO", fullName, mesecnaCena, ugovornaObaveza, 250, 100);
		this.uredjaj = uredjaj;
	}

	@Override
	public int brojMeseciZaDinar() {
		return 6;
	}

	public void uvecanjeNeta(int uvecanje) {
		this.brzinaNetDownload += uvecanje;
		this.brzinaNetUpload += uvecanje;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(" i " + this.brojMeseciZaDinar() + " meseca/i za dinar");
	}

}
