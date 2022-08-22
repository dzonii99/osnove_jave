package d19_08_2022;

public class FacebookPost {
	private String fullNameWho;
	private String fullNameWhich;
	private String text;
	private int likes;
	private int shares;

	public FacebookPost() {

	}

	public FacebookPost(String fullNameWho, String fullNameWhich, String text) {
		this.fullNameWho = fullNameWho;
		this.fullNameWhich = fullNameWhich;
		this.text = text;
	}

	public void like() {
		this.likes += 1;
	}

	public void dislike() {
		this.likes -= 1;
		if (this.likes <= 0) {
			this.likes = 0;
		}
	}

	public void share() {
		this.shares += 1;
	}

	public void print() {
		System.out.println(this.fullNameWho + " >>> " + this.fullNameWhich);
		System.out.println(this.text);
		System.out.println("Likes - " + this.likes + " | Shares - " + this.shares);
	}

	public String getFullNameWho() {
		return this.fullNameWho;
	}

	public String getFullNameWhich() {
		return this.fullNameWhich;
	}

	public String getText() {
		return this.text;
	}

	public int getLikes() {
		return this.likes;
	}

	public int getShares() {
		return this.shares;
	}

	public void setFullNameWho(String fullNameWho) {
		this.fullNameWho = fullNameWho;
	}

	public void setFullNameWhich(String fullNameWhich) {
		this.fullNameWhich = fullNameWhich;
	}

	public void setText(String text) {
		this.text = text;
	}

}
