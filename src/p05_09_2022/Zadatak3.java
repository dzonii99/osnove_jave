package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {

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
