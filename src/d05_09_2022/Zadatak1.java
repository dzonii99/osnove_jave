package d05_09_2022;

import java.net.SocketTimeoutException;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u 
//		kojima rade i ispisati platu za svakog

		Radnik menadzer = new Menadzer("Goran Todorovic");
		Radnik magacioner = new Magacioner("Kosta Pajkovic");
		Sektor s1 = new Sektor("Project manager", 1000);
		Sektor s2 = new Sektor("Web design", 1500);
		Sektor s3 = new Sektor("Digital marketing", 1300);
		Sektor s4 = new Sektor("Nabavka komponenti", 500);
		Sektor s5 = new Sektor("Prodaja", 900);
		menadzer.zaposli(s1);
		menadzer.zaposli(s2);
		menadzer.zaposli(s3);

		magacioner.zaposli(s4);
		magacioner.zaposli(s5);

		System.out.println("Menadzer " + menadzer.fullName);
		System.out.println("Sa platom $" + menadzer.plata());
		System.out.println("Magacioner " + magacioner.fullName);
		System.out.println("Sa platom $" + magacioner.plata());

	}

}
