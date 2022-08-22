package p22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu Korisnik koja ima
//		ime
//		prezime
//		gettere i settere za ime i prezime
//		konstuktore koje mislite da su vam potrebni
//		metoda koja stampa u formatu:
//		(ime) (prezime)
//
//		Kreirati klasu FacebookPost
//		opis
//		korisnik (referenca na korisnika koji je kreirao post)
//		konstrukore koje mislite da su vam potrebni
//		metoda print, stampa u formatu:
//		(ime) (prezime)
//		(opis post-a)
//
//		U main metodi, kreirati jedan facebook post i jednog korisnika i 
//		pozvati svaku od metoda
		Korisnik korisnik = new Korisnik("Nikola", "Jokic");
		FacebookPost post1 = new FacebookPost("Hoce neko na basket?", korisnik);
		post1.print();

	}

}
