package p05_09_2022;

import java.util.ArrayList;

public class Kasa {
	ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
	ArrayList<Proizvod> proizvodi = new ArrayList<Proizvod>();

	public void dodajProizvod(Proizvod p) {
		this.proizvodi.add(p);
	}

	public Kasa() {
		Dodatak d1 = new Dodatak("luk", 15);
		Dodatak d2 = new Dodatak("plazma", 20);
		Dodatak d3 = new Dodatak("cokolada", 40);
		Dodatak d4 = new Dodatak("pistaci", 50);
		Dodatak d5 = new Dodatak("cajna", 70);
		Dodatak d6 = new Dodatak("pecurke", 80);
		Dodatak d7 = new Dodatak("cili", 50);
		Dodatak d8 = new Dodatak("jaja", 10);
		Dodatak d9 = new Dodatak("piletina", 30);
		Dodatak d10 = new Dodatak("oreo", 75);
		this.dodaci.add(d1);
		this.dodaci.add(d2);
		this.dodaci.add(d3);
		this.dodaci.add(d4);
		this.dodaci.add(d5);
		this.dodaci.add(d6);
		this.dodaci.add(d7);
		this.dodaci.add(d8);
		this.dodaci.add(d9);
		this.dodaci.add(d10);
	}

	public Dodatak trazenje(String nazivSastojka) {
		Dodatak d = dodaci.get(0);
		for (int i = 0; i < dodaci.size(); i++) {
			if (this.dodaci.get(i).getNaziv().equals(nazivSastojka)) {
				d = this.dodaci.get(i);
			}
		}
		return d;
	}

	public double sracunajCenuPorudzbine() {
		double suma = 0;
		for (int i = 0; i < proizvodi.size(); i++) {
			suma += this.proizvodi.get(i).ukupnaCena();
		}
		return suma;
	}

	public void printRacun() {
		for (int i = 0; i < proizvodi.size(); i++) {
			this.proizvodi.get(i).print();
		}
		System.out.println("Ukupan racun je: " + this.sracunajCenuPorudzbine() + " rsd");
	}

}
