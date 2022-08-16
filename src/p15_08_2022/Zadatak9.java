package p15_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
//		Napisati metodu koja vrsi konverziju rimske(string) u 
//		arapske brojeve(int). 
//		1 - I
//		2 - II
//		3 - III
//		4 - IV
//		5 - V
//
//		Kao parametar se unosi vrednost rimkog broja(string) a 
//		vraca se arapski (int).
//		Ako se unese V vraca se 5.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite rimski broj: ");
		String a = s.next();
		int arapski = rimski(a);
		System.out.println("Vas rimski " + a + " je arapski broj " + arapski);
	}

	public static int rimski(String a) {
		if (a.equals("V")) {
			return 5;
		} else if (a.equals("IV")) {
			return 4;
		} else if (a.equals("III")) {
			return 3;
		} else if (a.equals("II")) {
			return 2;
		} else if (a.equals("I")) {
			return 1;
		}
		return 0;
	}

}
