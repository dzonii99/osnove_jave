package p19_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
//		niz.set
//		niz.get(0);
		Korisnik k = new Korisnik();
		k.setIme("Milan");
		k.setPrezime("Jovanovic");
		k.setEmail("mialn@gmail.com");

		System.out.println(k.getIme() + " " + k.getPrezime());
//		k.ime = "Milan";
//		k.prezime = "Jovanovic";
//		k.email = "milan@gmail.com";
//		k.print();
//		

//		Korisnik m = new Korisnik("Nikola", "Nikolic", "nikola@gmail.com");
//		m.print();


//		
//		Korisnik l = new Korisnik("Lazar");
//		l.print();

		System.out.println(k);
	}

}
