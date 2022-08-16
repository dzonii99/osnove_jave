package d15_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se 
//		stampa prosledjena vrednost za 10 veca.Iz main-a pozvati 
//		izvrsenje metode za razlicite vrednosti.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite koliko brojeva zelite N: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj A: ");
			int a = s.nextInt();
			stampajVrednostZa10Vecu(a);
		}

	}

	public static void stampajVrednostZa10Vecu(int a) {
		a += 10;
		System.out.println("Vasa vrednost je: " + a);
	}

}
