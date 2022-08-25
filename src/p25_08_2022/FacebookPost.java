package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
	private String fullName;
	private String text;
	private ArrayList<Reakcija> reakcija = new ArrayList<Reakcija>();

	public FacebookPost(String fullName, String text) {
		this.fullName = fullName;
		this.text = text;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void reaguj(Reakcija reakcija) {

		for (int i = 0; i < this.reakcija.size(); i++) {
			if (this.reakcija.get(i).getFullName().equals(reakcija.getFullName())) {
				this.reakcija.remove(i);
				System.out.println(reakcija.getFullName() + " je reagovao/la " + reakcija.getTip());
			}
		}
		this.reakcija.add(reakcija);
	}

	private int brojReakcija(String tipReakcije) {
		int brojac = 0;
		for (int i = 0; i < reakcija.size(); i++) {
			if (this.reakcija.get(i).getTip().equals(tipReakcije)) {
				brojac++;
			}
		}
		return brojac;

	}

	public void print() {
		System.out.println(this.fullName);
		System.out.println(this.text);
		System.out.println("Smajli " + this.brojReakcija("smajli") + "| Like " + this.brojReakcija("like") + "| Srce "
				+ this.brojReakcija("srce"));

	}
}