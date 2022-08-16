package p15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati dve metode:
//			- Prva metoda koja stampa zvezdicu sa razmakom. 
//		- Druga metoda koja stampa samo novi red.
//		U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//		*  *  * 
//		*  *  
//		*  
		Scanner s = new Scanner(System.in);

		System.out.println("Unesite N: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			printZvezde();

		}
	}

	public static void printZvezde() {
		System.out.print("* ");
	}

	public static void printNoviRed() {
		System.out.println();
	}
}
