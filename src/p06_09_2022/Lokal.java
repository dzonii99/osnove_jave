package p06_09_2022;

public class Lokal extends Objekat {

	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}

	@Override
	public double porezObjekta() {
		return this.koeficijent() * this.povrsina * 1.3;
	}

	@Override
	public void print() {
		System.out.println("Lokal je na adresi: " + this.adresa);
		System.out.println("Sa povrsinom " + this.povrsina + "m²");
		System.out.println("Koji se nalazi u zoni " + this.zona);
		System.out.println("Porez za lokal je " + this.porezObjekta() + " rsd");

	}

}
