package p25_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		Zadatak(Za vezbanje)
//		Za potrebe google istorije potrebno je kreirati sledece klase.
//		Klasu HistoryPage koja ima:
//		naziv stranice
//		link do stranice 
//		vreme otvaranja stranice - sat i minut (2 atributa)
//		username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici 
//				za neki sajt)
//		konstuktore koji su logicni
//		gettere i setter (username i password nemaju settere)
//		metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username 
//		i password i setuje te atribute.
//		Metoda obrisi kolacice koja setuje username i password na null.
//		Metoda stampaj koja stampa podatke u formatu:
//		[sat] - [minut] - [ naziv ]�[ link ] [Ako postoje kredencijali stampa se zvezdica 
//		                                      pored linka]
//
//
//		Klasu History koja ima:
//		niz stranica koje su posecene
//		metoda otvori stranicu koja dodaje novi historypage u niz.
//		metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//		metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//		metoda obrisi istoriju - metoda brise celu istoriju
//		metoda sacuvajKredencija - od parametara se prima naziv stranice i username i 
//		password koji se cuvaju.
//		metoda pogledajIstoriju - stampa sve posecene stranice
//		metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//		metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su 
//		ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

		HistoryPage hp1 = new HistoryPage("Facebook", "https://www.facebook.com", 14, 32);
		HistoryPage hp2 = new HistoryPage("Google", "https://www.google.com", 16, 12);
		HistoryPage hp3 = new HistoryPage("Facebook", "https://www.facebook.com", 4, 54);
		HistoryPage hp4 = new HistoryPage("Facebook", "https://www.facebook.com", 12, 02);
		HistoryPage hp5 = new HistoryPage("Facebook", "https://www.facebook.com", 9, 41);
		HistoryPage hp6 = new HistoryPage("Facebook", "https://www.facebook.com", 21, 23);
		History h = new History();
		h.openPage(hp1);
		h.openPage(hp2);
		h.openPage(hp3);
		h.openPage(hp4);
		h.openPage(hp5);
		h.openPage(hp6);
		h.watchHistory();

	}

}
