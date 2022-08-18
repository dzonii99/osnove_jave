package p16_08_2022;

public class Auto {
//	ime i prezime vozaca
//	marku automobila
//	broj vrata
//	potrosnju na 100km (npr: 10)
//	trenutnu brzinu kojom se auto krece
	public String fullName;
	public String marka;
	public int vrata;
	public double potrosnja;
	public int brzina;
	public int godina;
	public int mesecReg;
	public int kubikaza;
	public String registracija;
	public boolean klima;
	public int maxBrzina;
	public double kapacitetRezervoara;
	public double trenutnoGorivo;

	public void print() {
//	[Vozac]
//			[Marka] - [br vrata]-ro vrata
//			Sa potrosnjom od [potrosnja] l na 100km
//			[Trenutna brzina auta] km/h je trenutna brzina.
//			Primer:
//			Milan Jovanovic
//			BMW - 5-ro vrata
//			Sa potrosnjom od 10 l na 100km
//			200 km/h je trenutna brzina
		System.out.println(this.fullName);
		System.out.println(this.marka + " - " + this.vrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println(this.brzina + "km/h je trenutna brzina.");

	}

	public boolean prekoracenje(int ogranicenje) {
		if (brzina >= ogranicenje) {
			return true;
		}
		return false;
	}

	public int kazna(int ogranicenje) {
		if (brzina > ogranicenje) {
			return (brzina - ogranicenje) * 1000;
		}
		return 0;
	}

	public boolean oldTimer() {
		if (godina < 1950) {
			return true;
		}
		return false;
	}

	public boolean reg(int trenutniMesec) {
		if (trenutniMesec > this.mesecReg) {
			return true;
		}
		return false;
	}

	public double cena() {
		if (kubikaza < 2000) {
			return 2000 * 100;
		}
		return 2000 * 100 * 0.3;
	}

	public void dodajGas() {
		if (this.brzina < this.maxBrzina) {
			this.brzina += 10;
		} else {
			this.brzina = maxBrzina;
		}
	}

	public void koci() {
		if (this.brzina > 0) {
			this.brzina -= 10;
		} else {
			this.brzina = 0;
		}
	}

	public double trenutnaPotrosnja() {
		double faktorKlime = 0;
		if (klima == true) {
			faktorKlime = 1.2;
		} else {
			faktorKlime = 1;
		}
		return (this.brzina / 100.0 * potrosnja) * faktorKlime;
	}

	public void stampajTablu() {
		double brojCrtica = (this.brzina * 100) / this.maxBrzina;
		for (int i = 0; i < 100; i++) {
			if (i < brojCrtica) {
				System.out.print("|");
			} else {
				System.out.print(".");
			}
		}
		System.out.print(this.brzina + "/" + this.maxBrzina + "km/h");
	}

	public double natociGorivo(double gorivoTocenje) {
		int litar = 170;
		double naplata = litar * gorivoTocenje;
		double trenutno = this.trenutnoGorivo + gorivoTocenje;
		if (trenutno > this.kapacitetRezervoara) {
			naplata =(this.kapacitetRezervoara-this.trenutnoGorivo) * litar ;
			this.trenutnoGorivo = this.kapacitetRezervoara;
		}
		return naplata;

	}
//	public double natoci(int litri) {
//		if (litri + this.tretnutnoURezervoaru > this.kapacitetRezervoara) {
//			return (this.kapacitetRezervoara - this.tretnutnoURezervoaru) * 100;
//		} else {
//			return litri * 100;
//		}
//	}
}
