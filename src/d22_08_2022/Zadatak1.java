package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		Autor autor = new Autor("Danijel", "Defo");
		Knjiga knjiga = new Knjiga("978-0-194-22984-5", "Robinzon Kruso", 1719, autor);
		knjiga.print();
		System.out.println();
		
		Autor autor2 = new Autor("Antoan de Sent", "Egziperi");
		Knjiga knjiga2 = new Knjiga("978-3-140-46407-9", "Mali princ", 1943, autor2);
		knjiga2.print();
		System.out.println();

		Autor autor3 = new Autor("Herman", "Melvil");
		Knjiga knjiga3 = new Knjiga("978-0-393-97283-2", "Mobi Dik", 1851, autor3);
		knjiga3.print();

	}

}
