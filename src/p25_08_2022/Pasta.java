package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
	ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();

	public void dodajSastojak(Sastojak sastojak) {
		this.sastojci.add(sastojak);
	}

	public void print() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < sastojci.size(); i++) {
			this.sastojci.get(i).print();
		}

	}

	public void suma() {
		int suma = 0;
		for (int i = 0; i < sastojci.size(); i++) {
			suma += this.sastojci.get(i).getCena();
		}
		System.out.println("Cena paste je: " + suma + ".din");
	}

	public void removeSastojak(String nazivSastojka) {
		for (int i = 0; i < sastojci.size(); i++) {
			if (sastojci.get(i).getNaziv().equals(nazivSastojka))
				this.sastojci.remove(i);
		}

	}

}
