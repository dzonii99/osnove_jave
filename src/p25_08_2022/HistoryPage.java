package p25_08_2022;

public class HistoryPage {
	private String naziv;
	private String link;
	private int vremeSati;
	private int vremeMinuti;
	private String username;
	private String password;

	public HistoryPage(String naziv, String link, int vremeSati, int vremeMinuti) {
		this.naziv = naziv;
		this.link = link;
		this.vremeSati = vremeSati;
		this.vremeMinuti = vremeMinuti;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getVremeSati() {
		return vremeSati;
	}

	public void setVremeSati(int vremeSati) {
		this.vremeSati = vremeSati;
	}

	public int getVremeMinuti() {
		return vremeMinuti;
	}

	public void setVremeMinuti(int vremeMinuti) {
		this.vremeMinuti = vremeMinuti;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void save(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void removeCookies() {
		this.username = null;
		this.password = null;
	}

	public void print() {
		System.out.print(this.vremeSati + " - " + this.vremeMinuti + " - " + this.naziv + " ... " + this.link);
		if (this.username != null && this.password != null) {
			System.out.print("*");
		}
		System.out.println();
	}

}
