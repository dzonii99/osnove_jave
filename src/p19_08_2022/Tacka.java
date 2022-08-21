package p19_08_2022;

public class Tacka {
	private int x;
	private int y;

	public void print() {
		System.out.println("Tacka X je " + this.x + " tacka Y je " + this.y);
	}

	public Tacka() {

	}

	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
