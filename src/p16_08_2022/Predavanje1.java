package p16_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
//		String ime = "Milan";
//		String email = "milan@gamil.com";

		Korisnik k = new Korisnik();
		k.ime = "Milan";
		k.email = "milan@gmail.com";
		k.godine = 27;
		k.stampaj();

//		System.out.println(k.ime + ", kontakt: " + k.email);
//		System.out.println("Starost: " + k.godine);

		Korisnik r = new Korisnik();
		r.ime = "Nikola";
		r.godine = 29;
		r.email = "nikola@gmail.com";
		r.stampaj();
//		System.out.println(r.ime + ", kontakt: " + r.email);
//		System.out.println("Starost: " + r.godine);

	}

}
