package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {
//	 Zadatak
//	 Kreirati abstraktnu klasu Figura koja ima
//	 abstraktnu metodu povrsina
//	 abstraktnu metodu obim
//	 metodu koja stampa podatke u formatu:
//	 Povrsina je (povrsina)
//	 Obim je (obim)
//
//	 Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//	 stranicu a
//	 gettere/settere/konstruktore
//	 implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//	 implementira metodu obim
//
//	 Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//	 stranice a i b
//	 gettere/settere/konstruktore
//	 implementira metodu povrsina
//	 implementira metodu obim
//
//	 U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob


	public static void main(String[] args) {
		ArrayList<Figura> figure = new ArrayList<Figura>();
		Figura t1 = new JednakostranicniTrougao(2);
		Figura t2 = new JednakostranicniTrougao(4);
		Figura p1 = new Pravougaonik(2, 4);
		Figura p2 = new Pravougaonik(5, 10);
		Figura p3 = new Pravougaonik(3, 6);
		figure.add(t1);
		figure.add(t2);
		figure.add(p1);
		figure.add(p2);
		figure.add(p3);
		for (int i = 0; i < figure.size(); i++) {
			figure.get(i).print();
		}

	}

}
