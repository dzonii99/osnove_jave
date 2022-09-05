package d05_09_2022;

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
		Sektor s4 = new Sektor("Java programming", 1700);
		Sektor s5 = new Sektor("HR", 900);
		menadzer.zaposli(s1);
		menadzer.zaposli(s2);
		menadzer.zaposli(s3);
		menadzer.zaposli(s4);
		menadzer.zaposli(s5);

		magacioner.zaposli(s1);
		magacioner.zaposli(s2);
		magacioner.zaposli(s3);
		magacioner.zaposli(s4);
		magacioner.zaposli(s5);

		System.out.println("$" + menadzer.plata());
		System.out.println("$" + magacioner.plata());

	}

}
