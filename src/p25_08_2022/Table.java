package p25_08_2022;

import java.util.ArrayList;

public class Table {
	private int brojRedovaPoStrani;
	private TableHeader header;
	ArrayList<TableRow> niz = new ArrayList<TableRow>();

	public void setHeader(TableHeader header) {
		this.header = header;
	}

	public void dodavanjeNovogReda(TableRow red) {
		this.niz.add(red);
	}

	public void print(int brojRedovaPoStrani) {
		header.print();
		for (int i = 0; i < this.niz.size(); i++) {
			this.niz.get(i).print();
		}
	}

	public void printHTML() {
		System.out.println("<table>");
		System.out.println("<thead>");
		header.printHTML();
		System.out.println("</thead>");
		System.out.println("<tbody>");
		for (int i = 0; i < this.niz.size(); i++) {
			this.niz.get(i).print();
		}
		System.out.println("</tbody>");
		System.out.println("</table>");
	}

	public void filter(String tekst) {
		header.printHTML();
		for (int i = 0; i < this.niz.size(); i++) {
			if (this.niz.get(i).daLiSeSadrzi(tekst) == true) {
				this.niz.get(i).print();
			}
		}
	}

	public void printPaginator() {
	}

}
