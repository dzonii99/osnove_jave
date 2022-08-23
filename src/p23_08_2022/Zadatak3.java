package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu Sastojak koja ima:
//			naziv sastojka
//			cenu 
//			gettere i settere 
//			konstuktore
//
//
//			--U glavnom programu kreirati 3 sastojka.
//				 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. 
//				 Ucitavaju se N sastojaka i na kraju odstampati niz. 
//				 Koristeci ArrayList-e
		Scanner s = new Scanner(System.in);
		ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		System.out.print("Unesite koliko sastojaka zelite: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite naziv sastojka: ");
			String naziv = s.next();
			System.out.print("Unesite cenu sastojka: ");
			int cena = s.nextInt();
			Sastojak sastojak = new Sastojak(naziv, cena);
			sastojci.add(sastojak);
		}
		for (int i = 0; i < sastojci.size(); i++) {
			System.out.print(sastojci.get(i).getNaziv());
			System.out.print(" ");
			System.out.println(sastojci.get(i).getCena());
		}

	}

}
