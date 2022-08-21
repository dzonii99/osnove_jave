package d18_08_2022;

public class FacebookPost {
	public String fullNameWho;
	public String fullNameWhich;
	public String text;
	public int likes;
	public int shares;

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
}
