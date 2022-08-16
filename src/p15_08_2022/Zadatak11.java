package p15_08_2022;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
//		Napisati metodu za sumiranje dva broja. Metoda prima dva broja,
//		racuna sumu i vraca sracunatu vrednost.
//		U glavnom programu iskoristiti metodu za sumiranje za racunanje
//		sledece formule
//		a = proizvoljno
//		b = proizvoljno
//		c = proizvoljno
//		x = 10 + a + b + c
//		U glavnom programu gde god vam je potrebno da izvrsite operaciju
//		+ vi izvrsite to preko metode za sumiranje
//		Hint u threadu, pa ko hoce moze da pogleda
//		Najlakse da se sabiranje zameni metodom je da razbijete formulu 
//		na
//		x = 10 + a
//		x = x + b
//		x = x + c
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite a: ");
		int a = s.nextInt();
		System.out.print("Unesite b: ");
		int b = s.nextInt();
		System.out.print("Unesite c: ");
		int c = s.nextInt();
		int x = sumiranje(a);
		x = sumiranje2(b, x);
		x = sumiranje3(c, x);
		System.out.println("Vas broj x = 10" + " + " + a + " + " + b + " + " + c + " = " + x);

	}

	public static int sumiranje(int a) {
		return 10 + a;

	}

	public static int sumiranje2(int b, int x) {
		return x + b;
	}

	public static int sumiranje3(int c, int x) {
		return x + c;
	}
}
