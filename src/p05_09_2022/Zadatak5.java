package p05_09_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		Dodatak d1 = new Dodatak("plazma", 20);
		Dodatak d2 = new Dodatak("cokolada", 40);
		Dodatak d3 = new Dodatak("pistaci", 50);
		Dodatak d4 = new Dodatak("cajna", 70);
		Dodatak d5 = new Dodatak("pecurke", 80);
		Dodatak d6 = new Dodatak("cili", 50);

		Proizvod p1 = new IcePoint("vanila", true);
		Proizvod p2 = new IcePoint("cokolada", false);
		Proizvod p3 = new IcePoint("jagoda", true);
		Proizvod p4 = new Pica(500);
		Proizvod p5 = new Pica(300);

		p1.ubaciDodatak(d1);
		p2.ubaciDodatak(d2);
		p2.ubaciDodatak(d3);
		p3.ubaciDodatak(d1);
		p3.ubaciDodatak(d2);
		p3.ubaciDodatak(d3);
		p4.ubaciDodatak(d5);
		p4.ubaciDodatak(d4);
		p5.ubaciDodatak(d6);
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		p5.print();
	}

}
