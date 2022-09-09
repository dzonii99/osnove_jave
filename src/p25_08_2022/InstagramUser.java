package p25_08_2022;

public class InstagramUser {
	private String username;
	private String fullName;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public InstagramUser(String username, String fullName, String email) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.email = email;
	}
	

}
