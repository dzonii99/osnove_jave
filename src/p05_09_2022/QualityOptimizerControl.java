package p05_09_2022;

public class QualityOptimizerControl extends Control {
	private double brzinaInterneta;

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public QualityOptimizerControl(double brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		double kvalitet = this.brzinaInterneta * 10.1;
		if (kvalitet <= 144) {
			vp.setKvalitetVidea(144);
		} else if (kvalitet <= 240) {
			vp.setKvalitetVidea(240);
		} else if (kvalitet <= 360) {
			vp.setKvalitetVidea(360);
		} else if (kvalitet <= 480) {
			vp.setKvalitetVidea(480);
		} else if (kvalitet <= 720) {
			vp.setKvalitetVidea(720);
		} else if (kvalitet <= 1080) {
			vp.setKvalitetVidea(1080);
		}

	}

}
