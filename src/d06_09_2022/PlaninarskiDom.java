package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String nazivDoma;
	private int godinaOsnovanja;
	private ArrayList<Planinar> p = new ArrayList<Planinar>();

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public int getGodinaOsnovanja() {
		return godinaOsnovanja;
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnovanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnovanja = godinaOsnovanja;
	}

	public PlaninarskiDom() {
		super();
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.p.add(planinar);
	}

	public int uspesnoPentranje(Planina planina) {
		int brojac = 0;
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).uspesanUspon(planina)) {
				brojac++;
			}
		}
		return brojac;
	}

	public void izbaciPlaninara(int id) {
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).getId() == id) {
				p.remove(i);
			}
		}
	}

	public void print() {
		System.out.println("Naziv doma je " + this.nazivDoma);
		System.out.println("Koji je osnovnan: " + this.godinaOsnovanja);
		for (int i = 0; i < p.size(); i++) {
			p.get(i).print();
		}
		System.out.println("Dom ima mesecni prihod od: " + this.mescniPrihod() + " rsd");
	}

	public double mescniPrihod() {
		double suma = 0;
		for (int i = 0; i < p.size(); i++) {
			suma += p.get(i).clanarina();
		}
		return suma;
	}

}
