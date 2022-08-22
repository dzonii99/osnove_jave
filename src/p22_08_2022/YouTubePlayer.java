package p22_08_2022;

public class YouTubePlayer {
	private Video video;
	private int kvalitet;
	private String rezim;
	private int jacinaZvuka;
	private int trenutnoVreme;

	public YouTubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitet = 144;
		this.rezim = "mini player";
	}

	public Video getVideo() {
		return video;
	}

	public int getKvalitet() {
		return kvalitet;
	}

	public String getRezim() {
		return rezim;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}

	public void ucitajVideo(Video video) {
		this.video = video;
		this.trenutnoVreme = 0;
		this.video.pregledi();

	}

	public void pojacaj() {
		this.jacinaZvuka += 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}

	public void smanji() {
		this.jacinaZvuka -= 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}

	public void postaviKvalitet(int brzinaNet) {
		if (brzinaNet <= 2) {
			kvalitet = 144;
		} else if (brzinaNet <= 4) {
			kvalitet = 240;
		} else if (brzinaNet <= 6) {
			kvalitet = 360;
		} else if (brzinaNet <= 8) {
			kvalitet = 720;
		} else {
			kvalitet = 1080;
		}
	}

	public void aktivirajMiniPlayerMod() {
		this.rezim = "mini player";
	}

	public void aktivirajBioskopskiMod() {
		this.rezim = "bioskopski rezim";
	}

	public void aktivirajPrekoCelogEkrana() {
		this.rezim = "preko celog ekrana";
	}

	public void premotajUnapred() {
		this.trenutnoVreme += 10;
		if (this.trenutnoVreme > video.getDuzinaSek()) {
			this.trenutnoVreme = video.getDuzinaSek();
		}

	}

	public void premotajUnazad() {
		this.trenutnoVreme -= 10;
		if (this.trenutnoVreme < 0) {
			this.trenutnoVreme = 0;
		}
	}

	public void iscrtajZvuk() {
		System.out.print(" Zvuk <: ");
		if (this.jacinaZvuka <= 0) {
			System.out.print("/");
		} else {
			int brCrtica = this.jacinaZvuka / 10;
			for (int i = 0; i < brCrtica; i++) {

				System.out.print("|");
			}
		}
		System.out.println();
	}

	public void iscrtajRezim() {
		if (this.rezim.equals("mini player")) {
			System.out.print("");
		} else if (this.rezim.equals("bioskopski rezim")) {
			System.out.print("..");
		} else if (this.rezim.equals("preko celog ekrana")) {
			System.out.print("||||");
		}
		System.out.println();
	}

	public void iscrtajTrenutnoVreme() {
		int minut = this.trenutnoVreme / 60;
		int sekund = this.trenutnoVreme % 60;
		int minutUkupnog = video.getDuzinaSek() / 60;
		int sekundUkupnog = video.getDuzinaSek() % 60;
		System.out.print(minut + ":" + sekund + "/" + minutUkupnog + ":" + sekundUkupnog);
	}

	public void iscrtajTimeline() {
		int zvezdice = this.trenutnoVreme * 100 / video.getDuzinaSek();
		for (int i = 0; i < zvezdice; i++) {
			System.out.print("*");
		}
		for (int i = zvezdice; i < 100; i++) {
			System.out.print(".");
		}
	}

	public void iscitaj() {
		this.iscrtajTrenutnoVreme();
		this.iscrtajZvuk();
		this.iscrtajTimeline();
		System.out.println();
		System.out.println("Kvalitet: " + this.kvalitet);
		System.out.print("Rezim: ");
		this.iscrtajRezim();
		System.out.println(video.getNaziv());
		System.out.println("Likes: " + video.getLike() + " | Dislike: " + video.getDislike());
		System.out.println(video.getViews() + " Prikaz");
	}

	public void share() {
		System.out.println("https://youtu.be/" + video.getId());
	}

}
