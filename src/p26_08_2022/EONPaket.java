package p26_08_2022;

public class EONPaket extends Paket {

	public EONPaket(String fullName, int mesecnaCena, int ugovornaObaveza) {
		super("EON LIGHT DUO", fullName, mesecnaCena, ugovornaObaveza, 150, 75);
	}

	@Override
	public int brojMeseciZaDinar() {
		return 3;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(" i " + this.brojMeseciZaDinar() + " meseca/i za dinar");
	}

}
