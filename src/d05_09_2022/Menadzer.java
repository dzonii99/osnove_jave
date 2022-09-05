package d05_09_2022;

public class Menadzer extends Radnik {

	public Menadzer(String fullName) {
		super(fullName);
	}

	@Override
	public double plata() {
		double suma = 0;
		for (int i = 0; i < sektori.size(); i++) {
			suma += sektori.get(i).getPlata();
		}
		return suma;
	}

}
