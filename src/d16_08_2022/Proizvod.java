package d16_08_2022;

public class Proizvod {

	public String naziv;
	public double cena;
	public double tezina;

	public void print() {
		System.out.println("{" + this.naziv + "}" + ", {" + this.cena + " RSD}" + ", {" + this.tezina + "g}");
	}

	public double convert(String jedinica) {
		if (jedinica.equals("kg")) {
			return this.tezina / 1000;
		} else if (jedinica.equals("t")) {
			return this.tezina / 1000000;
		}
		return 0;
	}

}
