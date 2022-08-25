package d23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost 
//		(stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.
//			
//				Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije 
//		koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda 
//			prima parametar koji
//		predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte 
//			fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
//			Kao parametar funkcije se unosi 
//		vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//			a na drugi racun dodaje samo 
//		(trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno 
//			sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
//
//			Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
		Racun posiljalac = new Racun("231654564", "Miodrag Petrovic", 154000);
		Racun primalac = new Racun("546654897", "Smiljka Stojkovic", 50000);
		Transakcija t = new Transakcija("123132465", posiljalac, primalac);
		t.prenos(253000);
		t.print();
		System.out.println();

		Transakcija t2 = new Transakcija("5454879874", posiljalac, primalac);
		t2.prenos(20000);
		t2.print();
		System.out.println();

		Transakcija t3 = new Transakcija("23146548", posiljalac, primalac);
		t3.prenos(4000);
		t3.print();

	}

}
