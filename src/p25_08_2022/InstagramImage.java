package p25_08_2022;

import java.util.ArrayList;

public class InstagramImage {
	ArrayList<InstagramTag> tagovi = new ArrayList<InstagramTag>();
	private String putanja;
	private int visinaSlike;
	private int sirinaSlike;

	public String getPutanja() {
		return putanja;
	}

	public int getVisinaSlike() {
		return visinaSlike;
	}

	public int getSirinaSlike() {
		return sirinaSlike;
	}

	public InstagramImage(String putanja, int visinaSlike, int sirinaSlike) {
		super();
		this.putanja = putanja;
		this.visinaSlike = visinaSlike;
		this.sirinaSlike = sirinaSlike;
	}

	public void dodajTag(InstagramTag tag) {
		this.tagovi.add(tag);
	}

}
