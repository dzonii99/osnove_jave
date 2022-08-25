package p25_08_2022;

public class Reakcija {
	private String tip;
	private String fullName;

	public Reakcija(String tip, String fullName) {
		this.tip = tip;
		this.fullName = fullName;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
