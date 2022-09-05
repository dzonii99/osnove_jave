package p05_09_2022;

public abstract class Figura {
	public abstract double povrsina();

	public abstract double obim();

	public void print() {
		System.out.println("Povrsina je: " + this.povrsina());
		System.out.println("Obim je: " + this.obim());
	}

}
