package p25_08_2022;

import java.util.ArrayList;

public class TableRow {
	ArrayList<String> tabele = new ArrayList<String>();

	public void addRowCell(String polje) {
		this.tabele.add(polje);
	}

	public void print() {
		for (int i = 0; i < this.tabele.size(); i++) {
			System.out.println(this.tabele.get(i) + "\t\t|\t\t");
		}
	}

	public void printHTML() {
		System.out.println("<tr>");
		for (int i = 0; i < tabele.size(); i++) {
			System.out.print("<td>");
			System.out.print(tabele.get(i));
			System.out.print("</td>");
		}
		System.out.println("</tr>");

	}

	public boolean daLiSeSadrzi(String tekst) {
		for (int i = 0; i < tabele.size(); i++) {
			if (this.tabele.get(i).equals(tekst)) {
				return true;
			}
		}
		return false;
	}
}
