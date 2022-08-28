package d26_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu Karton koja ima:
//		tip kartona (crveni, zuti)
//		konstuktore za koje mislite da ce vam trebati
//		gettere i settere za karton
//			
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve 
//		informacije o igracu
//
//		U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
		Igrac2 player1 = new Igrac2("Petko Peric", "0311995112457", 1995, 22, "napadac");
		Igrac2 player2 = new Igrac2("Zoki Sumarevic", "1207990321124", 1990, 0, "golman");
		Karton k1 = new Karton("crveni");
		Karton k2 = new Karton("zuti");
		player1.setKapiten(true);
		player1.dodajKarton(k1);
		player2.dodajKarton(k2);
		player2.dodajKarton(k2);
		player1.print();
		player2.print();

	}

}
