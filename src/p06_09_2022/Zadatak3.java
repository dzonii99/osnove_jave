package p06_09_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati apstraktnu klasu Atleticar čiji su tributi: 
//			ime i prezime privatni
//			i rezultat ostvaren na takmičenju koji je zasticen
//			Javne metode klase su: 
//			apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//			metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//			Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći. 
//			Kreirati i klasu Disciplina čiji su privatni atributi: 
//			ime discipline
//			tip discipline (Trkacka ili Skakacka)
//			niz atletičara koji učestvuju u toj disciplini. 
//			U javnom delu klase definisati: 
//			konstuktore, gettere i settere
//			konstruktor koji postavlja ime discipline i tip
//			metodu dodaj atleticara u disciplinu
//			metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//			(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//			(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline. 
//			U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,  (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline. 
		Disciplina skokUDalj = new Disciplina("Skok u dalj", "skakaci");
		Disciplina stoMetara = new Disciplina("100m sa preponama", "trkaci");
		Atleticar t1 = new Trkac("Jovan Pavlovic", 9.8);
		Atleticar t2 = new Trkac("Pavle Stojanovic", 9.98);
		Atleticar t3 = new Trkac("Petar Petrovic", 9.84);
		Atleticar t4 = new Trkac("Pavle Stojanovic", 12);
		stoMetara.dodajAtleticara(t1);
		stoMetara.dodajAtleticara(t2);
		stoMetara.dodajAtleticara(t3);
		stoMetara.dodajAtleticara(t4);
		stoMetara.diskvalifikuj("Pavle Stojanovic");
		stoMetara.print();

		Skakac a1 = new Skakac("Jovana Trickovic", 6.73);
		Skakac a2 = new Skakac("Tara Davidovac", 6.55);
		Skakac a3 = new Skakac("Jasmina Petrusevic", 6.5);
		Skakac a4 = new Skakac("Ivana Spanovic", 7);
		skokUDalj.dodajAtleticara(a1);
		skokUDalj.dodajAtleticara(a2);
		skokUDalj.dodajAtleticara(a3);
		skokUDalj.dodajAtleticara(a4);
		skokUDalj.print();

	}

}
