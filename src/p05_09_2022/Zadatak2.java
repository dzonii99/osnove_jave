package p05_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//2. .Zadatak 
//  Napraviti klasu apstraktnu PlatnaKartica koja ima
//  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//  atribut broj kartice  primer: 4012-1239-1221-3381
//  atribut godina - godina do kada vazi kartica
//  atribut mesec-  mesec do kada vazi kartica
//  konstruktor sa parametrima
//  gettere za sve atribute, bez settera
//  metodu dodajSredstva koja povecava sumu za unetu vrednost
//  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//  apstraktnu metodu koja stampa podatke o kartici.
//
//  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
// ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//getter i setter za ovlasceno lice
//konstruktor sa parametrima
//  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
//
//	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//  konstruktor sa parametrima
//  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232
//	  u main funkciji, napraviti visa i master kartice i testirati funkcije
		VisaKartica vk = new VisaKartica(52000, "1254-4312-8487-1001", 2025, 10);
		MasterKartica mk = new MasterKartica(40000, "1221-4578-5566-0023", 2022, 12);
		vk.izvrsiTransakciju(3000);
		mk.izvrsiTransakciju(5000);
		mk.naplatiOdrzavanje();
		vk.print();
		mk.print();
	}

}
