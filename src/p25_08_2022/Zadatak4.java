package p25_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak(Za vezbanje)
//		Kreirati klasu InstagramUser koja ima:
//		username
//		Ime i prezime
//		email
//		Sve sto vam dalje zatreba dopunite klasu.
//		Kreiarti klasu InstagramTag koja ima:
//		x koordinatu na slici
//		y koordinatu na slici
//		usera koji je tagovan
//		Kreirati klasu InstagramImage koja ima:
//		niz tagova
//		dimenziju slike
//		putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//		metodu dodajTag
//
//		Kreirati klasu InstagramPost koja ima
//		niz slika
//		Opis koji moze da se postavi za post
//		metodu dodajSliku
		InstagramUser user = new InstagramUser("zvonko123", "Zvonimir Cvetkovic", "zvonko123@gmail.com");
		InstagramUser user2 = new InstagramUser("stefi345", "Stefan Jovanovic", "stefko34@gmail.com");

		InstagramTag tag = new InstagramTag(30, 30, user);

		InstagramImage image = new InstagramImage("instagram.com/zvonko-post/profilna.png", 500, 300);

		InstagramPost post = new InstagramPost("Gde si Zvonko? Kad cemo u drva?");
		image.dodajTag(tag);
		post.dodajSliku(image);
		post.print();
		
	}

}
