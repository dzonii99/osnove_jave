package p06_09_2022;

public class Skakac extends Atleticar {

	public Skakac(String fullName, double rezultat) {
		super(fullName, rezultat);
	}

	@Override
	public boolean koJeBolji(Atleticar atleta) {
		return this.rezultat > atleta.rezultat ? true : false;
	}

}
