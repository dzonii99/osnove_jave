package d25_08_2022;

import java.util.ArrayList;

public class Listic {
	ArrayList<Kombinacija> nizKombinacija = new ArrayList<Kombinacija>();

	public void dodajKombinaciju(Kombinacija niz) {
		if (this.nizKombinacija.size() < 7) {
			this.nizKombinacija.add(niz);
		}
	}

	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.nizKombinacija.size(); i++) {
			if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		for (int i = 0; i < this.nizKombinacija.size(); i++) {
			this.nizKombinacija.get(i).print();
			System.out.println();
		}
	}

}
