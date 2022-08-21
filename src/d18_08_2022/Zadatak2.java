package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post 
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude 
//					manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati 
//			svaku funkciju.
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1

		FacebookPost firstCase = new FacebookPost();
		firstCase.fullNameWhich = "Zoran Jovanovic";
		firstCase.fullNameWho = "Jovan Jovanovic";
		firstCase.text = "Gde si brate?";
		firstCase.likes = 10;
		firstCase.shares = 0;
		firstCase.print();
		System.out.println();

		firstCase.like();
		firstCase.like();
		firstCase.like();

		firstCase.dislike();

		for (int i = 0; i < 5; i++) {
			firstCase.share();
		}

		FacebookPost secondCase = new FacebookPost();
		secondCase.fullNameWho = "Fernanda Espanola";
		secondCase.fullNameWhich = "Zoran Jovanovic";
		secondCase.text = "Habla Espanol Jovan??";
		secondCase.likes = 3014;
		secondCase.shares = 0;
		secondCase.print();
		System.out.println();

		secondCase.like();

		for (int i = 0; i < 154; i++) {
			secondCase.share();
		}
		for (int i = 0; i < 3200; i++) {
			secondCase.dislike();
		}

		FacebookPost thirdCase = new FacebookPost();
		thirdCase.fullNameWho = "Nikola Jokic";
		thirdCase.fullNameWhich = "Zoran Jovanovic";
		thirdCase.text = "Hoce neko na basket?";
		thirdCase.likes = 321457;
		thirdCase.shares = 114034;
		thirdCase.print();
		System.out.println();

		for (int i = 0; i < 547847; i++) {
			thirdCase.like();
		}
		for (int i = 0; i < 1540; i++) {
			thirdCase.dislike();
		}
		for (int i = 0; i < 124758; i++) {
			thirdCase.share();
		}
		for(int i=0; i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
		firstCase.print();
		secondCase.print();
		thirdCase.print();
		for(int i=0; i<50;i++) {
			System.out.print("-");
		}

	}

}
