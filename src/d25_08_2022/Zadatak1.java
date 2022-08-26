package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
		Ispit predmet1 = new Ispit("Elektronika", 10, "Radojka Milojkovic");
		Ispit predmet2 = new Ispit("Matematika", 5, "Radojka Milojkovic");
		Ispit predmet3 = new Ispit("Algoritmi i programiranje", 5, "Radojka Milojkovic");
		Ispit predmet4 = new Ispit("Elektrotehnika", 9, "Radojka Milojkovic");
		Ispit predmet5 = new Ispit("Multimedije", 8, "Radojka Milojkovic");
		Ispit predmet6 = new Ispit("Engleski", 7, "Radojka Milojkovic");
		Student student = new Student(32123465, "Sumadinka Jovanovic", "osnovne");
		student.dodajIspit(predmet1);
		student.dodajIspit(predmet2);
		student.dodajIspit(predmet3);
		student.dodajIspit(predmet4);
		student.dodajIspit(predmet5);
		student.dodajIspit(predmet6);
		student.print();

	}

}
