package p25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//
//		Kreirati klasu Sastojak koja ima:
//		naziv
//		cenu
//		gettere i settere
//		konstruktore
//		metodu za stampanje koja stampa  podatke u formatu:
//		naziv - cena.din
//			
//			Kreirati klasu Pasta koja ima:
//		niz sastojaka
//		metodu za dodavanje sastojka
//		defaultni konstruktor
//		metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//		metodu za stampu koja stampa podatke u formatu:
//		Pasta je sa sastojcima:
//		naziv - cena.din
//		naziv - cena.din
//		naziv - cena.din
//		Cena paste je cena.din
//
//		U glavnom programu kreirati objekte i testirati funkcionalnosti 
//
//
//		(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv 
//		sastojka koji se brise.

		Sastojak s1 = new Sastojak("Slanina", 300);
		Sastojak s2 = new Sastojak("Parmezan", 140);
		Sastojak s3 = new Sastojak("Jaje", 15);
		Sastojak s4 = new Sastojak("Testenina", 180);
		Sastojak s5 = new Sastojak("Ulje", 200);
		Pasta p1 = new Pasta();
		p1.dodajSastojak(s1);
		p1.dodajSastojak(s2);
		p1.dodajSastojak(s3);
		p1.dodajSastojak(s4);
		p1.dodajSastojak(s5);
		p1.print();
		System.out.println();
		p1.removeSastojak("Ulje");
		p1.print();

	}

}
