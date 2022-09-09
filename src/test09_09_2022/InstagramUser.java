package test09_09_2022;

public class InstagramUser {
	private String username;
	private String fullName;

	public InstagramUser(String username) {
		super();
		this.username = username;
	}

	public InstagramUser(String username, String fullName) {
		super();
		this.username = username;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void print() {
		System.out.println("@" + this.username + "  \t  " + this.fullName);
	}

	public String generiseLink() {
		String link = "https://www.instagram.com/" + this.username + "/";
		return link;
	}

}
