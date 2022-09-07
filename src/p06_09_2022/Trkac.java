package p06_09_2022;

public class Trkac extends Atleticar {

	public Trkac(String fullName, double rezultat) {
		super(fullName, rezultat);
	}

	@Override
	public boolean koJeBolji(Atleticar atleta) {
		return this.rezultat < atleta.rezultat ? true : false;
	}

}
