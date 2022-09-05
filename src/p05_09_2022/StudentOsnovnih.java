package p05_09_2022;

public class StudentOsnovnih extends Student {

	public StudentOsnovnih(String fullName, int brojIndeksa, int godinaStudija) {
		super(fullName, brojIndeksa, godinaStudija);
	}

	@Override
	public int cenaSkolarine() {
		return 90000;
	}

	@Override
	public boolean budzet() {
		return this.godinaStudija < 5 ? true : false;
//		return this.godinaStudija < 5;
	}

}
