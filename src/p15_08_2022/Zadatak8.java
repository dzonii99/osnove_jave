package p15_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
//		Napisati metodu koja proverava da li je trougao pravougli.
//		Metoda prima stranice trougla i hipotenuzu trougla. 
//		Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite stranicu a: ");
		int a = s.nextInt();
		System.out.print("Unesite stranicu b: ");
		int b = s.nextInt();
		System.out.print("Unesite stranicu c: ");
		int c = s.nextInt();
		boolean trougao = pravoguliTrougao(a, b, c);
		if (trougao == true) {
			System.out.println("Trougao je pravougli");
		} else {
			System.out.println("Trougao nije pravoguli");
		}

	}

	public static boolean pravoguliTrougao(int a, int b, int c) {
//		return a * a + b * b == c * c;
		if (a * a + b * b == c * c) {
			return true;
		}
		return false;
	}
}
