package d15_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je 
//			aktivan kao parametre metode.Metoda nista ne vraca.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite jmbg: ");
		String jmbg = s.next();
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite godinu rodjenja: ");
		int godinaRodjenja = s.nextInt();
		System.out.print("Unesite da li je korisnik aktivan(true/false): ");
		boolean aktivan = s.nextBoolean();
		id(jmbg,ime,prezime,godinaRodjenja,aktivan);

	}

	public static void id(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
		System.out.println("JMBG:            " + "[" + jmbg + "]");
		System.out.println("Ime:             " + "[" + ime + "]");
		System.out.println("Prezime:         " + "[" + prezime + "]");
		System.out.println("Godina rodjenja: " + "[" + godinaRodjenja + "]");
		System.out.println("Aktivan:         " + "[" + aktivan + "]");
	}

}
