package d23_08_2022;

public class ElektricniSporet {
	private String marka;
	private int garancija;
	private int maxBrojUkljucenihRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;

	public ElektricniSporet(String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		super();
		this.marka = marka;
		this.garancija = garancija;
		this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxBrojUkljucenihRingli() {
		return maxBrojUkljucenihRingli;
	}

	public Ringla getGoreLevo() {
		return goreLevo;
	}

	public Ringla getGoreDesno() {
		return goreDesno;
	}

	public Ringla getDoleLevo() {
		return doleLevo;
	}

	public Ringla getDoleDesno() {
		return doleDesno;
	}

	public void pojacaj(int pozicija) {
		int brojUpaljenihRingli = 0;
		if (pozicija == 1) {
			this.goreLevo.pojacajRinglu();
			brojUpaljenihRingli++;
		}
		if (pozicija == 2) {
			this.goreDesno.pojacajRinglu();
			brojUpaljenihRingli++;
		}
		if (pozicija == 3) {
			this.doleLevo.pojacajRinglu();
			brojUpaljenihRingli++;
		}
		if (pozicija == 4) {
			this.doleDesno.pojacajRinglu();
			brojUpaljenihRingli++;
		}
		if (brojUpaljenihRingli > this.maxBrojUkljucenihRingli) {
			if (pozicija != 1) {
				this.iskljuciRinglu(1);
			}
			if (pozicija != 2) {
				this.iskljuciRinglu(2);
			}
			if (pozicija != 3) {
				this.iskljuciRinglu(3);
			}
			if (pozicija != 4) {
				this.iskljuciRinglu(4);
			}
		}
	}

	public void iskljuciRinglu(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.iskljuciRinglu();
		}
		if (pozicija == 2) {
			this.goreDesno.iskljuciRinglu();
		}
		if (pozicija == 3) {
			this.doleLevo.iskljuciRinglu();
		}
		if (pozicija == 4) {
			this.doleDesno.iskljuciRinglu();
		}
	}

	public double ukupnaPotrosnja(int vremePrveRingle, int vremeDrugeRingle, int vremeTreceRingle,
			int vremeCetvrteRingle) {
		return this.goreLevo.potrosnja(vremePrveRingle) + this.goreDesno.potrosnja(vremeDrugeRingle)
				+ this.doleLevo.potrosnja(vremeTreceRingle) + this.doleDesno.potrosnja(vremeCetvrteRingle);

	}

	public void print() {
		System.out.println(this.marka + " - " + this.garancija + "god garancije");
		System.out.println("Ringle:");
		System.out.println("Gore levo: ");
		goreLevo.print();
		System.out.println("Gore desno: ");
		goreDesno.print();
		System.out.println("Dole levo: ");
		doleLevo.print();
		System.out.println("Dole desno: ");
		doleDesno.print();

	}

}
