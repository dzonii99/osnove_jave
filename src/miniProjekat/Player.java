package miniProjekat;

public class Player {
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Player(String fullName) {
		this.fullName = fullName;
	}

	public void print() {
		System.out.println(this.fullName);
	}

}
