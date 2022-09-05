package p05_09_2022;

public class TimeControl extends Control {
	private boolean strana;

	public TimeControl(boolean strana) {
		super();
		this.strana = strana;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (this.strana == true) {
			vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() + 15);
		} else {
			vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() - 15);
		}
		if (vp.getTrenutnoVremeVidea() > vp.getDuzinaVidea()) {
			vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
		}
	}

}
