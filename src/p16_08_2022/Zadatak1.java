package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim
//		podacima i ostampati podatke za svaki objekat.
		Scanner s = new Scanner(System.in);

		Racun r = new Racun();
		r.ime = "Jovan";
		r.prezime = "Krstic";
		r.broj = "851-14578-454";
		r.stanje = 5000;
		System.out.println("Ime i prezime: " + r.ime + " " + r.prezime);
		System.out.println("Broj racuna: " + r.broj);
		System.out.println("Stanje na racunu je: " + r.stanje);

		Racun t = new Racun();
		t.ime = "Zoran";
		t.prezime = "Jovanovic";
		t.broj = "784-65874-121";
		t.stanje = 1000;
		System.out.println("Ime i prezime: " + t.ime + " " + t.prezime);
		System.out.println("Broj racuna: " + t.broj);
		System.out.println("Stanje na racunu je: " + t.stanje);

		System.out.print("Unesite sumu za transakciju: ");
		int suma = s.nextInt();
		r.stanje -= suma;
		t.stanje += suma;
		System.out.println("Ime i prezime: " + r.ime + " " + r.prezime);
		System.out.println("Broj racuna: " + r.broj);
		System.out.println("Stanje na racunu je: " + r.stanje);
		System.out.println("Ime i prezime: " + t.ime + " " + t.prezime);
		System.out.println("Broj racuna: " + t.broj);
		System.out.println("Stanje na racunu je: " + t.stanje);

	}
}
