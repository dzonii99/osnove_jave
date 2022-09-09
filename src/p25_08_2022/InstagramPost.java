package p25_08_2022;

import java.util.ArrayList;

public class InstagramPost {
	ArrayList<InstagramImage> slike = new ArrayList<InstagramImage>();
	private String opisZaPost;

	public String getOpisZaPost() {
		return opisZaPost;
	}

	public InstagramPost(String opisZaPost) {
		super();
		this.opisZaPost = opisZaPost;
	}

	public void dodajSliku(InstagramImage slika) {
		this.slike.add(slika);
	}

	public void print() {
		for (int i = 0; i < this.slike.size(); i++) {
			System.out.println(this.opisZaPost);
			System.out.println(this.slike.get(i).getPutanja());
			System.out.println(this.slike.get(i).tagovi.get(i).getTagovanUser().getUsername());

		}
	}
}
