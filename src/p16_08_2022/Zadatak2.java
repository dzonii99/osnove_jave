package p16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Krairti klasu SlackMessage koja ima:
//			tekst poruke
//			ime i prezime osobe koja je stavila poruku
//			datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//			U glavnom programu kreirati 2 slack poruke sa proizvoljnim 
//			podacima i ostampati obe poruke u formatu:
//			[ime i prezime osobe] - [kad je poslata]
//			[Tekst poruke]
//		Dopunite klasu SlackMessage metodom za stampu koja stampa 
//		podatke u formatu koji je naveden iznad i u mainu pozovite metode
//		nad objektima koje ste kreirali.
		SlackMessage osoba = new SlackMessage();

		osoba.fullName = "Milan Jovanovic";
		osoba.datum = "16.08.2022. 11:20";
		osoba.tekst = "Novi zadatak za vezbanje";

		SlackMessage osoba2 = new SlackMessage();

		osoba2.fullName = "Nikola Milovanovic";
		osoba2.datum = "10.08.2022. 15:20";
		osoba2.tekst = "Milan Sasa Kovacevic sa ali-ja";

		osoba.print();

		osoba2.print();

	}

}
