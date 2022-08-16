package p15_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati dve metode, jedna metoda sluzi za stampanje imena a druga 
//		sluzi za stampanje prezimena. U glavnom programu pozvati metode na 
//		izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.

		for (int i = 0; i<5;i++) {
			printIme();
			printPrezime();
		}

	}

	public static void printIme() {
		System.out.print("Nikola");
	}

	public static void printPrezime() {
		System.out.println(" Milovanovic");
	}
}
