package p25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu Reakcija koja ima 
//	tip reakcije (smajli, like, srce)
//	ime i prezime korisnika koji je reagovao 
//	gettere, settere i konstruktore
//
//	Kreirati klasu FacebookPost koja ima:
//	ime i prezime korisnika koji je stavio oglas
//	tekst objave
//	niz reakcija
//	metodu reaguj, koja dodaje reakciju u niz
//	(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik 
//	reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) 
//	izbaciti prethodnu reakciju i uracunati novu.
//	Primer: Milan - lajkuje
//		 Nemanja - lajkuje
//		 Milan - daje srce
//	Post ima lajk od Nemanje i srce od Milana.
//	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip 
//			reakcije koji moze da bude smajli, like ili srce)
//	metodu stampaj koja stampa podatke u formatu:
//	ime i prezime
//	tekst objave
//	Smajli 10 | Like 15 | Srce 2
		Reakcija r1 = new Reakcija("smajli", "Smiljka Zivadinovic");
		Reakcija r2 = new Reakcija("smajli", "Milorad Stankovic");
		Reakcija r3 = new Reakcija("like", "Jovan Petrovic");
		Reakcija r4 = new Reakcija("srce", "Zivojin Misic");
		Reakcija r5 = new Reakcija("srce", "Milosava Jovic");
		Reakcija r6 = new Reakcija("srce", "Milorad Stankovic");
		FacebookPost fb = new FacebookPost("Pera Peric", "Izbusila mi se guma na traktor");
		fb.reaguj(r1);
		fb.reaguj(r2);
		fb.reaguj(r3);
		fb.reaguj(r4);
		fb.reaguj(r5);
		fb.print();
		System.out.println();
		fb.reaguj(r6);
		fb.print();

	}

}
