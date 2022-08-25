package d23_08_2022;

public class Transakcija {
	private String id;
	private Racun posiljalac;
	private Racun primalac;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	public Transakcija(String id, Racun posiljalac, Racun primalac) {
		this.id = id;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	private double provizija(double iznos) {
		if (iznos < 4500) {
			return 45;
		} else {
			return iznos * 0.01;
		}
	}

	public void prenos(double iznos) {
		if (posiljalac.getStanje() - iznos - this.provizija(iznos) >= 0) {
			posiljalac.menjaStanje(-iznos - this.provizija(iznos));
			primalac.menjaStanje(iznos);
		} else {
			System.out.println("Nemate dovoljno stanja na racunu!");
		}
	}

	public void print() {
		System.out.println("ID Transakcije: " + this.id);
		System.out.print("Racun: ");
		posiljalac.print();
		System.out.println();
		System.out.print("Racun: ");
		primalac.print();
	}

}
