package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	private ArrayList<Ambalaza> a = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.a.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < a.size(); i++) {
			if (this.a.get(i).getBarkod().equals(barkod)) {
				this.a.remove(i);
			}
		}
	}

	private double cenaSaPopustom(int popust) {
		double suma = 0;
		for (int i = 0; i < a.size(); i++) {
			suma += this.a.get(i).cenaArtikla();
		}
		suma= suma * (1 - (popust / 100.0));
		return suma;
	}

	public double ukupnaCenaKorpe(SuperKartica popust) {
		return cenaSaPopustom(popust.getPopust());

	}

}
