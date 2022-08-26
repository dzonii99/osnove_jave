package p26_08_2022;

public class Profesor extends Osoba {
	private String nazivPredmeta;
	private double iznosPlate;

	public Profesor(String fullName, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(fullName, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}

	public void povecajPlatu(double procenatPovecanja) {
		this.iznosPlate += (this.iznosPlate / 100) * procenatPovecanja;
//		ukoliko je int procenat i plata
//		this.iznosPlate = this.iznosPlate * (100+procenatPovecanja
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Predaje: " + this.nazivPredmeta);
		System.out.println("Ima platu: " + this.iznosPlate);
	}

}
