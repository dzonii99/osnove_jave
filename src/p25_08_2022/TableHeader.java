package p25_08_2022;

import java.util.ArrayList;

public class TableHeader {
	ArrayList<String> celije = new ArrayList<String>();

	public void addHeaderCell(String header) {
		this.celije.add(header);
	}

	public void print() {
		for (int i = 0; i < this.celije.size(); i++) {
			System.out.println(this.celije.get(i) + "\t\t|\t\t");
		}
	}

	public void printHTML() {
		System.out.println("<tr>");
		for (int i = 0; i < celije.size(); i++) {
			System.out.print("<th>");
			System.out.print(celije.get(i));
			System.out.print("</th>");
		}
		System.out.println("</tr>");

	}
}
