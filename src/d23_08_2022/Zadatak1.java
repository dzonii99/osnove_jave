package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako 
//				je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<ZeleniKarton>();
		Scanner s = new Scanner(System.in);

//		System.out.print("Unesite koliko studenata zelite: ");
//		int n = s.nextInt();
//		for (int i = 0; i < n; i++) {
//			System.out.print("Unesite ime i prezime studenta: ");
//			String celoIme = s.nextLine();
//			System.out.print("Unesite broj indeksa: ");
//			int brIndexa = s.nextInt();
//			s.nextLine();
//			System.out.print("Unesite naziv predmeta: ");
//			String predmet = s.nextLine();
//			System.out.print("Unesite naziv profesora: ");
//			String celoImeProf = s.nextLine();
//			System.out.print("Unesite ocenu: ");
//			int ocena = s.nextInt();
//			s.nextLine();
//			ZeleniKarton student = new ZeleniKarton(celoIme, brIndexa, predmet, celoImeProf, ocena);
//			zeleniKarton.add(student);
//		}
		ZeleniKarton student1 = new ZeleniKarton("Zoran Mladenovic", 13216, "Fizika", "Goran Ristic", 5);
		ZeleniKarton student2 = new ZeleniKarton("Smiljana Stojkovic", 11217, "Graficki dizajn", "Valentina Nejkovic",
				10);
		ZeleniKarton student3 = new ZeleniKarton("Zivojin Jankovic", 10451, "Elektrotehnika", "Aleksandar Milenkovic",
				6);
		ZeleniKarton student4 = new ZeleniKarton("Milorad Milicevic", 17250, "Elektronika", "Tatjana Subarevic", 10);
		ZeleniKarton student5 = new ZeleniKarton("Mitar Mitrovic", 1, "Engleski", "Milosava Radivojevic", 8);
		ZeleniKarton student6 = new ZeleniKarton("Leposava Petrovic", 2016, "Algoritmi i programiranje",
				"Vladimir Ciric", 8);
		ZeleniKarton student7 = new ZeleniKarton("Cedomir Zdravkovic", 4377, "Matematika", "Milos Marjanovic", 7);
		ZeleniKarton student8 = new ZeleniKarton("Caslavka Jovic", 8000, "Fizika", "Aleksandra Stojkovic", 9);
		ZeleniKarton student9 = new ZeleniKarton("Ugljesa Spasic", 12103, "Informatika", "Slavoljub Zivkovic", 10);
		ZeleniKarton student10 = new ZeleniKarton("Tvrtko Nikolic", 1754, "Srpski jezik", "Darko Puflovic", 5);

		zeleniKarton.add(student1);
		zeleniKarton.add(student2);
		zeleniKarton.add(student3);
		zeleniKarton.add(student4);
		zeleniKarton.add(student5);
		zeleniKarton.add(student6);
		zeleniKarton.add(student7);
		zeleniKarton.add(student8);
		zeleniKarton.add(student9);
		zeleniKarton.add(student10);

		for (int i = 0; i < zeleniKarton.size(); i++) {
			zeleniKarton.get(i).print();
		}

		double suma = 0;
		for (int i = 0; i < zeleniKarton.size(); i++) {
			suma += zeleniKarton.get(i).getOcena();
		}
		double prosecnaOcena = suma / zeleniKarton.size();
		System.out.println("Prosecna ocena je: " + prosecnaOcena);

		double suma2 = 0;
		int brojPolozenihIspita = 0;
		for (int i = 0; i < zeleniKarton.size(); i++) {
			if (zeleniKarton.get(i).ispit()) {
				suma2 += zeleniKarton.get(i).getOcena();
				brojPolozenihIspita++;
			}
		}
		double prosecnaOcenaPolozenih = suma2 / brojPolozenihIspita;
		System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenih);

	}

}
