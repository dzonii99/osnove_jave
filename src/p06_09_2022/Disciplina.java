package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
	private String imeDiscipline;
	private String tipDiscipline;
	ArrayList<Atleticar> atlete = new ArrayList<Atleticar>();

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public Disciplina(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}

	public void dodajAtleticara(Atleticar atleta) {
		this.atlete.add(atleta);
	}

	public void diskvalifikuj(String imeIPrezime) {
		for (int i = 0; i < atlete.size(); i++) {
			if (atlete.get(i).getFullName().equals(imeIPrezime)) {
				atlete.remove(i);
			}
		}
	}

	public Atleticar najboljiRezultat() {
		Atleticar a = this.atlete.get(0);
		for (int i = 0; i < atlete.size(); i++) {
			if (this.atlete.get(i).koJeBolji(a)) {
				a = atlete.get(i);
			}
		}
		return a;
	}

	public void print() {
		this.najboljiRezultat().print();
	}

}
