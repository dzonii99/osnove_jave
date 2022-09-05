package p05_09_2022;

public class StudentMaster extends Student {

	public StudentMaster(String fullName, int brojIndeksa, int godinaStudija) {
		super(fullName, brojIndeksa, godinaStudija);
	}

	@Override
	public int cenaSkolarine() {
		return 100000;
	}

	@Override
	public boolean budzet() {
		return this.godinaStudija < 2 ? true : false;
//		return this.godinaStudija < 2;
	}

}
