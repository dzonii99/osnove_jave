package d25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose
//		u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//		Za potrebe Lotto igre na srecu potrebno je 
//		Kreirati klasu Kombinacija koja ima:
//		id kombinacije (String)
//		niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		metodu koja proverava da li this kombinacija ima iste brojeve kao 
//		prosledjena kombinacija. 
//		Zaglavlje metode je:
//		public boolean daLiJeIstaKombinacija( Kombinacija k)
//		metoda vraca true ako su svi elementi na istim pozicija isti
//		npr: this [0] == k [0], this [1] == k [1] …. 
//		metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//			Kreirati klasu Listic koja ima: 
//		niz kombinacija - maksimalno 7 kombinacija
//		metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//		metodu koja vraca da li je kombinacija dobitna. Kao parametar se 
//		prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza 
//		i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti 
//		kombinacja koristi se metoda daLiJeIstaKombinacija
//		Zaglavlje metode 
//		public boolean dobitna(Kombinacija dobitnaKombinacija)
//		metodu koja stampa listic u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		…… i tako za sve kombinacije
		Listic listic = new Listic();
		Kombinacija k1 = new Kombinacija("32B45-457", 4, 13, 10, 22, 35, 11, 7);
		Kombinacija k2 = new Kombinacija("32F78-457", 1, 4, 5, 21, 37, 10, 8);
		Kombinacija k3 = new Kombinacija("32E89-457", 3, 12, 27, 25, 5, 10, 2);
		Kombinacija k4 = new Kombinacija("32R13-457", 6, 13, 10, 22, 35, 11, 3);
		Kombinacija k5 = new Kombinacija("32N11-457", 15, 16, 7, 27, 26, 38, 39);
		Kombinacija k6 = new Kombinacija("32B01-457", 21, 13, 10, 22, 35, 11, 1);
		Kombinacija k7 = new Kombinacija("32T32-457", 24, 11, 10, 21, 30, 23, 7);

		Kombinacija dobitnaKombinacija = new Kombinacija("32Y875-457", 6, 13, 10, 22, 35, 11, 3);
		Kombinacija dobitnaKombinacija2 = new Kombinacija("32Z01-457", 1, 4, 5, 21, 37, 10, 9);

		listic.dodajKombinaciju(k1);
		listic.dodajKombinaciju(k2);
		listic.dodajKombinaciju(k3);
		listic.dodajKombinaciju(k4);
		listic.dodajKombinaciju(k5);
		listic.dodajKombinaciju(k6);
		listic.dodajKombinaciju(k7);
		if (listic.dobitna(dobitnaKombinacija) == true) {
			System.out.println("Vasa kombinacija ");
			dobitnaKombinacija.print();
			System.out.print("je dobitna");
		} else {
			System.out.println("Vasa kombinacija ");
			dobitnaKombinacija.print();
			System.out.println("nije dobitna");
		}
		System.out.println();
		if (listic.dobitna(dobitnaKombinacija2) == true) {
			System.out.println("Vasa kombinacija ");
			dobitnaKombinacija2.print();
			System.out.println("je dobitna");
		} else {
			System.out.println("Vasa kombinacija ");
			dobitnaKombinacija2.print();
			System.out.println("nije dobitna");
		}
		System.out.println();
		listic.print();

	}

}
