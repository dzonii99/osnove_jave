package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati funkciju koja stampa zbir, razliku, 
//		proizvod i kolicnik za dva prosledjena broja. 
//		Brojevi su ulazni parametri funkcije. U gravnom 
//		programu pozvati nekoliko puta funkciju sa razlicitim 
//		prosledjenim vrednostima.
		calculator(13, 4);
		calculator(5, 8);
		calculator(3, 2);
		calculator(12, 6);
		calculator(25, 5);

	}

	public static void calculator(int a, int b) {
		int zbir = a + b;
		int razlika = a - b;
		int proizvod = a * b;
		int kolicnik = a / b;
		System.out.println("Zbir je: " + a + " + " + b + " = " + zbir);
		System.out.println("Razlika je: " + a + " - " + b + " = " + razlika);
		System.out.println("Prozivod je: " + a + " * " + b + " = " + proizvod);
		System.out.println("Kolicnik je: " + a + " / " + b + " = " + kolicnik);

	}

}
