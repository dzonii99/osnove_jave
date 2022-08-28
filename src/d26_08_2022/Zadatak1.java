package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
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
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve 
//		informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve 
//		informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na 
//		kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere 
//		unosi korisnik sa tastature.
		Igrac player1 = new Igrac("Petko Peric", "0311995112457", 1995, 22, "napadac");
		Igrac player2 = new Igrac("Zoki Sumarevic", "1207990321124", 1990, 0, "golman");
		player2.setKapiten(true);
		Trener trainer1 = new Trener("Smiljka Obrenovic", "0708989452163", 1989, 15, "medicinski");
		Trener trainer2 = new Trener("Jovan Stankovic", "0103001123110", 2001, 0, "pomocni");
		player1.print();
		player2.print();
		trainer1.print();
		trainer2.print();

//		Dodatak

		ArrayList<Osoba> igraci = new ArrayList<Osoba>();
		ArrayList<Osoba> treneri = new ArrayList<Osoba>();
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite koliko igraca zelite da unesete: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime i prezime igraca: ");
			String fullName = s.nextLine();
			System.out.print("Unesite godinu rodjenja igraca: ");
			int godinaRodj = s.nextInt();
			s.nextLine();
			System.out.print("Unesite jmbg igraca: ");
			String jmbg = s.nextLine();
			System.out.print("Unesite broj na dresu igraca: ");
			int broj = s.nextInt();
			s.nextLine();
			System.out.print("Unesite poziciju igraca: ");
			String pozicija = s.next();
			System.out.print("Da li je igrac kapiten? ");
			boolean kapiten = s.nextBoolean();
			Igrac igrac = new Igrac(fullName, jmbg, godinaRodj, broj, pozicija);
			igrac.setKapiten(kapiten);
			igraci.add(igrac);

		}
		System.out.print("Unesite koliko trenera zelite da unesete: ");
		int n1 = s.nextInt();
		for (int i = 0; i < n1; i++) {
			System.out.print("Unesite ime i prezime trenera: ");
			String fullName = s.nextLine();
			System.out.print("Unesite jmbg trenera: ");
			String jmbg = s.next();
			System.out.print("Unesite godinu rodjenja trenera: ");
			int godinaRodj = s.nextInt();
			s.nextLine();
			System.out.print("Unesite godine iskustva trenera: ");
			int godIskustva = s.nextInt();
			s.nextLine();
			System.out.print("Unesite tip trenera: ");
			String tip = s.next();
			Trener trener = new Trener(fullName, jmbg, godinaRodj, godIskustva, tip);
			treneri.add(trener);

		}
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).print();
		}
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).print();
		}
	}

}
