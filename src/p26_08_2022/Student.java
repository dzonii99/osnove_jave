package p26_08_2022;

public class Student extends Osoba {
	private int brojIndeksa;
	private int dugZaSkolarinu;

	public Student(String fullName, String jmbg, int brojIndeksa, int dugZaSkolarinu) {
		super(fullName, jmbg);
		this.brojIndeksa = brojIndeksa;
		this.dugZaSkolarinu = dugZaSkolarinu;
	}

	public void uplatiSkolarinu(int iznosUplate) {
		if (iznosUplate > this.dugZaSkolarinu) {
			this.dugZaSkolarinu = 0;
		} else {
			this.dugZaSkolarinu -= iznosUplate;
		}
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Broj indeksa: " + this.brojIndeksa);
		System.out.println("Dug za skolarinu je: " + this.dugZaSkolarinu);
	}

}
