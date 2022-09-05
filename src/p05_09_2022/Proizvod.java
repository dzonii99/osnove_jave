package p05_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();

	public void ubaciDodatak(Dodatak dodatak) {
		dodaci.add(dodatak);
	}

	public double vratiCenu() {
		double suma = 0;
		for (int i = 0; i < dodaci.size(); i++) {
			suma += this.dodaci.get(i).getCena();
		}
		return suma;
	}

	public abstract double ukupnaCena();

	public abstract void print();

}
