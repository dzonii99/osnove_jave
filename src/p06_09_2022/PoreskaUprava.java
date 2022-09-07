package p06_09_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class PoreskaUprava {
	private String imeGrada;
	ArrayList<Objekat> nizObjekta = new ArrayList<Objekat>();

	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
	}

	public void dodajObjekat(Objekat objekat) {
		this.nizObjekta.add(objekat);
	}

	public Objekat najveciPorez() {
		Objekat max = this.nizObjekta.get(0);
		for (int i = 0; i < this.nizObjekta.size(); i++) {
			if (max.porezObjekta() < this.nizObjekta.get(i).porezObjekta()) {
				max = this.nizObjekta.get(i);
			}

		}
		return max;
	}

	public Objekat najmanjiPorez() {
		Objekat min = this.nizObjekta.get(0);
		for (int i = 0; i < this.nizObjekta.size(); i++) {
			if (min.porezObjekta() > this.nizObjekta.get(i).porezObjekta()) {
				min = this.nizObjekta.get(i);
			}
		}
		return min;
	}

	public double ukupanPorez() {
		double suma = 0;
		for (int i = 0; i < this.nizObjekta.size(); i++) {
			suma += this.nizObjekta.get(i).porezObjekta();
		}
		return suma;
	}

	public void print() {
		for (int i = 0; i < this.nizObjekta.size(); i++) {
			this.nizObjekta.get(i).print();
		}
	}

}
