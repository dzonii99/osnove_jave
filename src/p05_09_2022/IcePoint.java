package p05_09_2022;

public class IcePoint extends Proizvod {
	private String tipSladoleda;
	private boolean velicinaSladoleda;

	public IcePoint(String tipSladoleda, boolean velicinaSladoleda) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.velicinaSladoleda = velicinaSladoleda;
	}

	public String getTipSladoleda() {
		return tipSladoleda;
	}

	public void setTipSladoleda(String tipSladoleda) {
		this.tipSladoleda = tipSladoleda;
	}

	public boolean isVelicinaSladoleda() {
		return velicinaSladoleda;
	}

	public void setVelicinaSladoleda(boolean velicinaSladoleda) {
		this.velicinaSladoleda = velicinaSladoleda;
	}

	@Override
	public double ukupnaCena() {
		double suma = this.vratiCenu();
		for (int i = 0; i < dodaci.size(); i++) {
			if (this.velicinaSladoleda == true) {
				suma += 100;
			} else {
				suma += 130;
			}
		}
		return suma;

	}

	@Override
	public void print() {
		System.out.println("Sladoled sa dodacima: ");
		for (int i = 0; i < dodaci.size(); i++) {
			dodaci.get(i).stampaj();
		}
		System.out.println("Tip sladoleda je " + tipSladoleda);
		System.out.print("Velicina sladoleda je: ");
		if (velicinaSladoleda == true) {
			System.out.println("veliki");
		} else {
			System.out.println("mali");
		}
		System.out.println("Ukupna cena je: " + this.ukupnaCena() + "rsd");

	}

}
