package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati funkciju koja za dva jednocifrena broja koja su
//		ulazni parametri funkcije vraca novu vrednost koja se formira
//		kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi jednocifren broj: ");
		int a = s.nextInt();
		if (a >= 0 && a < 10) {
			System.out.print("Unesite drugi jednocifren broj: ");
			int b = s.nextInt();
			if (b >= 0 && b < 10) {
				int dvocifren = pretvaranje(a, b);
				System.out.println("Vas broj je: " + dvocifren);
			} else {
				System.out.println("Uneli ste pogresan B.");
			}
		} else {
			System.out.println("Uneli ste pogresan A.");
		}

	}

	public static int pretvaranje(int a, int b) {
		return a * 10 + b;
	}

}
