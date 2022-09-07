package p06_09_2022;

public class Zgrada extends Objekat {
	private int brojStanova;

	public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
		super(adresa, povrsina, zona);
		this.brojStanova = brojStanova;
	}

	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}

	@Override
	public double porezObjekta() {
		return this.koeficijent() * this.povrsina * this.brojStanova;
	}

	@Override
	public void print() {
		System.out.println("Zgrada je na adresi: " + this.adresa + "sa " + this.brojStanova + " stanova");
		System.out.println("Sa povrsinom " + this.povrsina + "m²");
		System.out.println("Koja se nalazi u zoni " + this.zona);
		System.out.println("Porez za stan je " + this.porezObjekta() + " rsd");

	}

}
