package p22_08_2022;

public class Video {
	private String id;
	private String naziv;
	private int duzinaSek;
	private int like;
	private int dislike;
	private int views;

	public void like() {
		this.like += 1;
	}

	public void dislike() {
		this.dislike +=1;
	}

	public void pregledi() {
		this.views += 1;
	}

	public Video(String id, String naziv, int duzinaSek,int views) {
		this.id = id;
		this.naziv = naziv;
		this.duzinaSek = duzinaSek;
		this.views = views;
	}

	public String getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getDuzinaSek() {
		return duzinaSek;
	}

	public int getLike() {
		return like;
	}

	public int getDislike() {
		return dislike;
	}

	public int getViews() {
		return views;
	}

}
