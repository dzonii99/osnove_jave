package d18_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati 
//			sve metode.
		SmartAirConditioning klima = new SmartAirConditioning();

		klima.marka = "Vox";
		klima.potrosnjaCold = 1;
		klima.potrosnjaHot = 2.1;
		klima.temperatura = 25;
		klima.mod = false;
		if (klima.mod == false) {
			System.out.println("Klima hladi");
		} else {
			System.out.println("Klima greje");
		}
		klima.print();
		double potrosnjaMesec = klima.potrosnjaMesec();
		double placanje = klima.potrosnjaNovac();
		System.out.println("Vasa klima trosi " + potrosnjaMesec + "kw/h");
		System.out.println("Racun za vasu klimu iznosi " + placanje + "RSD");

		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima2.marka = "Samsung";
		klima2.potrosnjaCold = 2.5;
		klima2.potrosnjaHot = 3.2;
		klima2.temperatura = 20;
		klima2.mod = true;
		if (klima.mod == false) {
			System.out.println("Klima hladi");
		} else {
			System.out.println("Klima greje");
		}
		klima2.print();
		double potrosnjaMesec2 = klima2.potrosnjaMesec();
		double placanje2 = klima2.potrosnjaNovac();
		System.out.println("Vasa klima trosi " + potrosnjaMesec2 + "kw/h");
		System.out.println("Racun za vasu klimu iznosi " + placanje2 + "RSD");

	}

}
