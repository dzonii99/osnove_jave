package d06_09_2022;

public abstract class Planinar {
	protected int id;
	protected String fullName;

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public Planinar(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public abstract void print();

	public abstract double clanarina();

	public abstract boolean uspesanUspon(Planina planina);

}
