package test18_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		3. Zadatak (While petlja)
//		Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi
//		lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje lozinku 
//		sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke.
//		Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//		Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//		Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku 
//		“Mogucnost postavljanja lozinke je blokirana”
//		Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena” 
//		Primer izvrsenja 1:
//		Unesite lozinku: sifra123
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: sifra123
//		Lozinka je uspesno postavljena
//
//
//		Primer izvrsenja 2:
//		Unesite lozinku: sifra123
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Mogucnost postavljanja lozinke je blokirana
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite sifru koju zelite: ");
		String password = s.next();
		int greska = 1;
		int i = 3;
		String confirm = "null";
		while (greska != 5 && !password.equals(confirm)) {
			System.out.print("Potvrdite Vasu sifru: ");
			confirm = s.next();
			if (!password.equals(confirm)) {
				greska++;
				if (greska == 5) {
					System.out.println("Mogucnost postavljanja lozinke "
							+ "je blokirana");
				} else {
					System.out.println("Lozinke se ne poklapaju.Imate "
					+ "jos " + i + " puta. Probajte "
							+ "ponovo.");
					i--;
				}

			} else {
				System.out.println("Lozinka je uspesno postavljena");
			}

		}

	}

}
