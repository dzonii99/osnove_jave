package d16_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		SmartAirConditioning k = new SmartAirConditioning();
//		System.out.print("Unesite marku klime: ");
//		k.marka = s.next();
//		System.out.print("Unesite izabranu temperaturu: ");
//		k.temp = s.nextInt();
//		System.out.print("Unesite zeljeni mod(grejanje/hladjenje): ");
//		k.mod = s.next();
//		k.print();
//		System.out.println("Unesite spoljasnju temperaturu: ");
//		boolean spoljTemp = k.hot(s.nextInt());
//		if (spoljTemp == true) {
//			System.out.println("Napolju je veca temperatura");
//		} else {
//			System.out.println("Napolju je manja temperatura");
//		}

		SmartAirConditioning k = new SmartAirConditioning();
		k.marka = "Samsung";
		k.temp = 25;
		k.mod = "hladi";
		k.print();
		boolean spoljTemp = k.hot(32);
		if (spoljTemp == true) {
			System.out.println("Napolju je veca temperatura");
		} else {
			System.out.println("Napolju je manja temperatura");
		}

		SmartAirConditioning kucnaKlima = new SmartAirConditioning();
		kucnaKlima.marka = "Vox";
		kucnaKlima.temp = 21;
		kucnaKlima.mod = "greje";
		kucnaKlima.print();
		boolean spoljTemp2 = kucnaKlima.hot(19);
		if (spoljTemp2 == true) {
			System.out.println("Napolju je veca temperatura");
		} else {
			System.out.println("Napolju je manja temperatura");
		}

	}

}
