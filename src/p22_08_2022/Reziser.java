package p22_08_2022;

public class Reziser {
	private String fullName;
	private int starost;

	public Reziser(String fullName, int starost) {
		this.fullName = fullName;
		this.starost = starost;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public void print() {
		System.out.print(this.fullName + ", " + this.starost + " god");
	}

}
