package d16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar 
//		prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. 
//		Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

//		Scanner s = new Scanner(System.in);
//		Proizvod p = new Proizvod();
//		System.out.print("Unesite naziv prozivoda: ");
//		p.naziv = s.next();
//		System.out.print("Unesite cenu proizvoda: ");
//		p.cena = s.nextDouble();
//		System.out.print("Unesite tezinu prozivoda: ");
//		p.tezina = s.nextDouble();
//		p.print();
//		System.out.print("Unesite u koju jedinicu zelite da konvertujete(kg/t): ");
//		double zamena = p.convert(s.next());
//		System.out.println("Vasa tezina je: " + zamena);

		Scanner s = new Scanner(System.in);
		Proizvod p = new Proizvod();
		p.naziv = "Jabuke";
		p.cena = 170;
		p.tezina = 2310;
		p.print();
		System.out.println("Vasa tezina je: " + p.convert("kg") + " kg");

		Proizvod dzak = new Proizvod();
		dzak.naziv = "Pelet";
		dzak.cena = 36000;
		dzak.tezina = 3120000;
		dzak.print();
		System.out.println("Vasa tezina je: " + dzak.convert("t") + " tone");

	}

}
