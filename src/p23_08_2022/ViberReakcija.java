package p23_08_2022;

public class ViberReakcija {
	private String emoji;
	private ViberKorisnik reagovao;

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public ViberKorisnik getReagovao() {
		return reagovao;
	}

	public void setReagovao(ViberKorisnik reagovao) {
		this.reagovao = reagovao;
	}

	public ViberReakcija(String emoji, ViberKorisnik reagovao) {
		this.emoji = emoji;
		this.reagovao = reagovao;
	}

}
