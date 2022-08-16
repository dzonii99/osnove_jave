package d15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
//		Napisati funkciju koja za tri prosledjena broja vraca najmanji 
//		od ta 3. U glavnom programu iskoristi funkciju i ispisti 
//		odgovarajucu poruku.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj A: ");
		int a = s.nextInt();
		System.out.print("Unesite broj B: ");
		int b = s.nextInt();
		System.out.print("Unesite broj C: ");
		int c = s.nextInt();
		int min = minNumber(a, b, c);
		System.out.println("Najmanji broj od: " + a + ", " + b + ", " + c + " je " + min);
	}

	public static int minNumber(int a, int b, int c) {
		if (a > b && b < c) {
			return b;
		} else if (c < b && c < a) {
			return c;
		}
		return a;
	}

}
