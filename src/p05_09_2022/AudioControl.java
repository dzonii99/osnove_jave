package p05_09_2022;

public class AudioControl extends Control {
	private boolean promenaZvuka;

	public boolean isPromenaZvuka() {
		return promenaZvuka;
	}

	public void setPromenaZvuka(boolean promenaZvuka) {
		this.promenaZvuka = promenaZvuka;
	}

	public AudioControl(boolean promenaZvuka) {
		super();
		this.promenaZvuka = promenaZvuka;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (vp.getJacinaZvuka() >= 0 || vp.getJacinaZvuka() <= 100) {
			vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
		}

	}

}
