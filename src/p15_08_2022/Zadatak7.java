package p15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
//		Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//		Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//			Ako se metoda pozove za N=-11, vraca 11
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite vas broj N: ");
		int n = s.nextInt();
		int x = negativeNumber(n);
		System.out.println("Vas broj sa negativnom vrednoscu je: " + x);
	}

	public static int negativeNumber(int n) {
		return -n;
	}

}
