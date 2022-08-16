package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		Napisati metodu stampajApsolutnuVrednost,
//		koja stampa apsolutnu vrednost   prosledjene vrednosti.
		ApsolutnuVrednost(5);
		ApsolutnuVrednost(-4);
		ApsolutnuVrednost(-13);
		ApsolutnuVrednost(1);
	}

	public static void ApsolutnuVrednost(int x) {
		if (x < 0) {
			x = x * -1;
		}
		System.out.println("Apsolutna vrednost vaseg broja X je: " + x);
	}

}
