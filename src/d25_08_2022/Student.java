package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private int brojIndeksa;
	private String fullName;
	private String tipStudija;
	ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int brojIndeksa, String fullName, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.fullName = fullName;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosekOcena() {
		double suma = 0;
		int brojacPolozenih = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if (this.ispiti.get(i).ispitPolozen() == true) {
				suma += this.ispiti.get(i).getOcena();
				brojacPolozenih++;
			}
		}
		return suma / brojacPolozenih;
	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.fullName + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.print("Prosecna ocena: " + this.prosekOcena());
	}

}
