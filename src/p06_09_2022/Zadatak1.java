package p06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi: Object
//		adresa (ulica i broj)
//		povrsina objekta
//		zona (1, 2 ili 3)
//		konstuktore, gettere i settere
//		metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//		zona 1, koeficijent je 1.4
//		zona 2, koeficijent je 1.1
//		zona 3, koeficijent je 1.05
//		abstraktnu metodu koja racuna i vraca porez objekta
//		abstraktnu metodu stampaj 
//
//			Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//		konstuktore, gettere i setter
//		porez racuna po formuli: koeficijent * povrsina.
//		prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//			Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//		broj stanova
//		konstuktore, gettere i setter
//		porez racuna po formuli koeficijent * povrsina * broj stanova
//		prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//			
//			Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//		konstuktore
//		porez racuna po formuli koeficijent * povrsina * 1.3
//		prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//			Kreirati klasu PoreskaUprava koja za atribute ima:
//		ime grada u kom se nalazi
//		niz objekata
//		metodu dodaj objekat
//		(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//		(za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//		metodu koja racuna ukupan porez za ceo grad
//		metodu koja stampa sve objekte
//		U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.
		PoreskaUprava poreska = new PoreskaUprava("Nis");
		Objekat o1 = new Kuca("Bulevar Nemanjica 13", 43, 1);
		Objekat o2 = new Lokal("Jug Bogdanova 9", 50, 2);
		Objekat o3 = new Zgrada("Patrisa Lumumbe 24", 500, 3, 16);
		poreska.dodajObjekat(o1);
		poreska.dodajObjekat(o2);
		poreska.dodajObjekat(o3);
		o1.print();
		o2.print();
		o3.print();
		System.out.println("Najmanji porez je: " + poreska.najmanjiPorez().porezObjekta() + " rsd");
		System.out.println("Najveci porez je: " + poreska.najveciPorez().porezObjekta() + " rsd");
		System.out.println("Ukupan porez je: " + poreska.ukupanPorez() + " rsd");
	}

}
