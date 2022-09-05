package p05_09_2022;

public class Pica extends Proizvod {
	private int cenaPodloge;

	public Pica(int cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public int getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(int cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public double ukupnaCena() {
		double suma = this.vratiCenu();
		return suma += this.cenaPodloge;

	}

	@Override
	public void print() {
		System.out.println("Pica sa dodacima: ");
		for (int i = 0; i < dodaci.size(); i++) {
			dodaci.get(i).stampaj();
		}
		System.out.println("Pica sa podlogom " + this.cenaPodloge);
		System.out.println("Ukupna cena je: " + this.ukupnaCena() + "rsd");
	}

}
