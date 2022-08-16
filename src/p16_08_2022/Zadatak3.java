package p16_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu Auto koja ima:
//			ime i prezime vozaca
//			marku automobila
//			broj vrata
//			potrosnju na 100km (npr: 10)
//			trenutnu brzinu kojom se auto krece
//			metodu za stampu koja stampa podatke u formatu:
//			[Vozac]
//				[Marka] - [br vrata]-ro vrata
//				Sa potrosnjom od [potrosnja] l na 100km
//				[Trenutna brzina auta] km/h je trenutna brzina.
//				Primer:
//				Milan Jovanovic
//				BMW - 5-ro vrata
//				Sa potrosnjom od 10 l na 100km
//				200 km/h je trenutna brzina
//		U okviru klase Auto, implementirati jos 2 metode:
//			metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//			Kao parametar metode se prima ogranicenje (kao broj) a metoda 
//			vraca true ili false ako je trenutna brzina veca od ogranicenja.
//			metoda koja vraca visinu novcane kazne za prekoracenje, za svaku 
//			jedinicu prekoracenja placa se 1000din. Metoda od parametara 
//			prima ogranicenje brzine
//			U glavnom programu pozvati ove metode i odstmpajte neke poruke 
//			na osnovu informacija koje dobijete od njih.
//		Dopuniti klasu Auto tako da ima:
//			atribut godinu proizvodnje
//			atribut mesec do kad je registrovan auto (int)
//			atribut kubikaza auta (npr: 1600 - 5000)
//			metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//			metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//			metodu koja racuna i vraca cenu registracije za auto. 
//			Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//			za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

		Auto a = new Auto();

		a.brzina = 80;
		a.fullName = "Pera Petrovic";
		a.marka = "AUDI";
		a.potrosnja = 11;
		a.vrata = 5;
		a.godina = 1985;
		a.mesecReg = 6;
		a.kubikaza = 2000;
		a.print();
		boolean reg = a.reg(8);
		int kazna = a.kazna(60);
		boolean oldTimer = a.oldTimer();
		double cena = a.cena();
		boolean granica = a.prekoracenje(60);
		if (granica == true) {
			System.out.println("Vozac je prekoracio!");
			System.out.println("Vozac treba da plati: " + kazna + "RSD");

		} else {
			System.out.println("Vozac nije prekoracio");
		}
		if (oldTimer == true) {
			System.out.println("Vas auto je old tajmer.");
		} else {
			System.out.println("Vas auto nije old tajmer.");
		}
		if (reg == true) {
			System.out.println("Vas automobil je registrovan ");
		} else {
			System.out.println("Vas auto nije registrovan");
		}

		System.out.println("Vasa registracija kosta: " + cena + "RSD");

	}

}
