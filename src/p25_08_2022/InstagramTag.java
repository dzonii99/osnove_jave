package p25_08_2022;

public class InstagramTag {
	private int x;
	private int y;
	private InstagramUser tagovanUser;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public InstagramUser getTagovanUser() {
		return tagovanUser;
	}
	public InstagramTag(int x, int y, InstagramUser tagovanUser) {
		super();
		this.x = x;
		this.y = y;
		this.tagovanUser = tagovanUser;
	}
	

}
