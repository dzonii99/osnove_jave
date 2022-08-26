package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba, 
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu 
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.
//
//	(dopuna)
//	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu

		Student student1 = new Student("Srbislava Stojkovic", "231654654", 11234, 45000);
		Student student2 = new Student("Milorad Zivadinovic", "65456489788", 1245, 87000);
		Profesor profa1 = new Profesor("Goran Ristic", "5645646547", "Fizika", 170000);
		Profesor profa2 = new Profesor("Aleksandar Milenkovic", "564321213", "Algoritmi i programiranje", 134000);
		student1.print();
		System.out.println();
		student2.print();
		System.out.println();
		profa1.print();
		System.out.println();
		profa2.print();
		student1.uplatiSkolarinu(30000);
		student1.print();
		System.out.println();
		profa1.povecajPlatu(5);
		profa1.print();

	}

}
