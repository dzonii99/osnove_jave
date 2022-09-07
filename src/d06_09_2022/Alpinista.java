package d06_09_2022;

public class Alpinista extends Planinar {
	private int osvojeniPoeni;

	public int getOsvojeniPoeni() {
		return osvojeniPoeni;
	}

	public void setOsvojeniPoeni(int osvojeniPoeni) {
		this.osvojeniPoeni = osvojeniPoeni;
	}

	public Alpinista(int id, String fullName, int osvojeniPoeni) {
		super(id, fullName);
		this.osvojeniPoeni = osvojeniPoeni;
	}

	@Override
	public void print() {
		System.out.println("Aplinista, id: " + this.id);
		System.out.println("Ime: " + this.fullName);
		System.out.println("Broj poena: " + this.osvojeniPoeni);

	}

	@Override
	public double clanarina() {
		double clanarina = 1500;
		double kolikoManje = this.osvojeniPoeni * 50;
		if (kolikoManje > clanarina) {
			return 0;
		}
		return clanarina - kolikoManje;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() <= 4000) {
			return true;
		} else {
			return false;
		}
	}

}
