package p16_08_2022;

public class SlackMessage {
	public String tekst;
	public String fullName;
	public String datum;

	public void print() {
		System.out.println(this.fullName + " - " + this.datum);
		System.out.println(this.tekst);
	}
}
