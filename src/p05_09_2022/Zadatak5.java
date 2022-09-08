package p05_09_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		Zadatak(ZA VEZBANJE)
//		Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
//		Npr: Ice point vanila sa dodacima: plazma, cokolada
//		Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
//
//		Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//		 naziv dodatka
//		 cenu dodatka
//		 konstruktore, gettere i settere koji su vam potrebni
//		 metodu stampaj koja stampa u formatu:
//		(dodatak)  (cena)
//
//		Kreirati abstraktnu klasu Proizvod koja ima:
//		 niz dodataka
//		 metodu ubaciDodatak koja dodaje dodatak u niz
//		 metodu koja vraca cenu svih dodataka koje ima proizvod
//		 abstraktnu metodu ukupnu racunaj cenu 
//		 abstraktnu metodu stampaj
//
//
//
//		Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//		 tip sladoleda (vanila, cokolada)
//		 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//		 override uje metodu koja ukupnu cenu racuna:
//		ako je mali ice point na cenu svih dodataka doda 100
//		ako je veliki ice point cenu svih dodataka doda 130
//		override uje metodu stampaj da stampa sve podatke
//			
//		Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//		 cena podloge
//		 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//		override uje metodu stampaj da stampa sve podatke
//			
//		U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.
		Kasa k1 = new Kasa();
//		Dodatak d1 = new Dodatak("plazma", 20);
//		Dodatak d2 = new Dodatak("cokolada", 40);
//		Dodatak d3 = new Dodatak("pistaci", 50);
//		Dodatak d4 = new Dodatak("cajna", 70);
//		Dodatak d5 = new Dodatak("pecurke", 80);
//		Dodatak d6 = new Dodatak("cili", 50);

		Proizvod p1 = new IcePoint("vanila", true);
		Proizvod p2 = new IcePoint("cokolada", false);
		Proizvod p3 = new IcePoint("jagoda", true);
		Proizvod p4 = new Pica(500);
		Proizvod p5 = new Pica(300);

//		p1.ubaciDodatak(d1);
//		p2.ubaciDodatak(d2);
//		p2.ubaciDodatak(d3);
//		p3.ubaciDodatak(d1);
//		p3.ubaciDodatak(d2);
//		p3.ubaciDodatak(d3);
//		p4.ubaciDodatak(d5);
//		p4.ubaciDodatak(d4);
//		p5.ubaciDodatak(d6);
//		p1.print();
//		p2.print();
//		p3.print();
//		p4.print();
//		p5.print();
		k1.dodajProizvod(p1);
		k1.dodajProizvod(p2);
		k1.dodajProizvod(p4);
		k1.dodajProizvod(p5);
		p1.ubaciDodatak(k1.trazenje("oreo"));
		p1.ubaciDodatak(k1.trazenje("plazma"));
		p2.ubaciDodatak(k1.trazenje("cokolada"));
		p5.ubaciDodatak(k1.trazenje("cajna"));
		p4.ubaciDodatak(k1.trazenje("jaja"));

		k1.printRacun();
	}

}
