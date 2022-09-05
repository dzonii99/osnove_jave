package p05_09_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		VideoPlayer vp = new VideoPlayer(234, 230, 75, 240);
		Control vremeUnapred = new TimeControl(true);
		Control pojacajZvuk = new AudioControl(true);
		Control kvalitet = new QualityOptimizerControl(55);
		vremeUnapred.izvrsiAkciju(vp);
		pojacajZvuk.izvrsiAkciju(vp);
		kvalitet.izvrsiAkciju(vp);
		vp.print();

	}

}
