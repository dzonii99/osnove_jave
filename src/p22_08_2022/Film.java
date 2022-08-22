package p22_08_2022;

public class Film {
	private String naziv;
	private int godina;
	private Reziser reziser;

	public Film(String naziv, int godina, Reziser reziser) {
		this.naziv = naziv;
		this.godina = godina;
		this.reziser = reziser;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public void print() {
		System.out.println(this.naziv + ", " + this.godina);
		System.out.print("Rezirao je: " + reziser.getFullName() + ", " + reziser.getStarost() + " god");
//		System.out.print("Rezirao je: ");
//		r.print();
	}

}
