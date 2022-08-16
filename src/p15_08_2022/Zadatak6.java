package p15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa N zvezdica u istom redu. 
//		Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
//
//		Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//		N=9, print je=> * * * * * * * * * 
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			printStars(i);
		}

	}

	public static void printStars(int numberOfStars) {

		for (int i = 0; i < numberOfStars; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
