package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju 
//		treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema
//		povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu
//		vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut 
//		cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje 
//		preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se 
//		računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku 
//		od definisanih funkcija.

		Proizvod televizor = new Proizvod();
		televizor.cena = 55000;
		televizor.naziv = "Samsung";
		televizor.tezina = 14000;
		televizor.print();
		System.out.println();

		televizor.povecajCenu(6000);
		System.out.println("Nakon povecanja vasa cena je " + televizor.cena + "RSD");
		System.out.println();

		double cenaSaPopustomT = televizor.vratiCenuSaPopustom(20);
		System.out.println("Cena nakon popusta je: " + cenaSaPopustomT + "RSD");
		System.out.println();

		int postarina = televizor.racunajPostarinu();
		System.out.println("Postarina je: " + postarina + "RSD");
		System.out.println();

		Proizvod patike = new Proizvod();

		patike.cena = 24000;
		patike.naziv = "Nike Air Max 90";
		patike.tezina = 489.75;
		patike.print();
		System.out.println();

		patike.povecajCenu(1550);
		System.out.println("Nakon povecanja vasa cena je " + patike.cena + "RSD");
		System.out.println();

		double cenaSaPopustomP = patike.vratiCenuSaPopustom(50);
		System.out.println("Cena nakon popusta je: " + cenaSaPopustomP + "RSD");
		System.out.println();

		patike.povecajCenu(5123);
		patike.cena -= cenaSaPopustomP;
		System.out.println("Nakon povecanja vasa cena je " + patike.cena + "RSD");
		System.out.println();

		int postarina2 = patike.racunajPostarinu();
		System.out.println("Postarina je: " + postarina2 + "RSD");

	}

}
