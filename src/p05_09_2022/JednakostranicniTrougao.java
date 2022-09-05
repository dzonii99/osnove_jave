package p05_09_2022;

public class JednakostranicniTrougao extends Figura {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public JednakostranicniTrougao(int a) {
		super();
		this.a = a;
	}

	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
	}

	@Override
	public double obim() {
		return 3 * a;
	}

}
