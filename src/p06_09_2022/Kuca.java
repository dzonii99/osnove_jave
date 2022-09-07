package p06_09_2022;

public class Kuca extends Objekat {

	public Kuca(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}

	@Override
	public double porezObjekta() {
		return this.koeficijent() * this.povrsina;
	}

	@Override
	public void print() {
		System.out.println("Kuca je na adresi: " + this.adresa);
		System.out.println("Sa povrsinom " + this.povrsina + "m²");
		System.out.println("Koja se nalazi u zoni " + this.zona);
		System.out.println("Porez za kucu je " + this.porezObjekta() + " rsd");

	}

}
