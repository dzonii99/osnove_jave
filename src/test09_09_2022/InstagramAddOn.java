package test09_09_2022;

public abstract class InstagramAddOn {
	protected int id;
	protected int x;
	protected int y;
	protected int sirinaDodatka;
	protected int visinaDodatka;

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSirinaDodatka() {
		return sirinaDodatka;
	}

	public int getVisinaDodatka() {
		return visinaDodatka;
	}

	public InstagramAddOn(int id, int x, int y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public abstract int minSirina();

	public abstract int minVisina();

	public void povecanjeDimenzije(int visina, int sirina) {
		this.sirinaDodatka += sirina;
		this.visinaDodatka += visina;
	}

	public void smanjenjeDimenzije(int visina, int sirina) {
		if (this.sirinaDodatka - sirina < this.minSirina()) {
			this.sirinaDodatka = this.minSirina();
		} else {
			this.sirinaDodatka -= sirina;
		}
		if (this.visinaDodatka - visina < this.minVisina()) {
			this.visinaDodatka = this.minVisina();
		} else {
			this.visinaDodatka -= visina;
		}
	}

	public abstract void print();

}
