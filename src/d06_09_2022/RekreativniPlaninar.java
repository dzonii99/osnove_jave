package d06_09_2022;

public class RekreativniPlaninar extends Planinar {
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maxUspon;

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaxUspon() {
		return maxUspon;
	}

	public RekreativniPlaninar(int id, String fullName, int tezinaOpreme, String nazivOkruga, int maxUspon) {
		super(id, fullName);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUspon = maxUspon;
	}

	@Override
	public void print() {
		System.out.println("Rekreativac, id: " + this.id);
		System.out.println("Ime: " + this.fullName);
		System.out.println("Okrug: " + this.nazivOkruga);

	}

	@Override
	public double clanarina() {
		return 1000;
	}

//	1kg = 50 metara manje
//	20kg * 50 =1000 m manje
	@Override
	public boolean uspesanUspon(Planina planina) {
		double kolikoManje = this.tezinaOpreme * 50;
		if (planina.getVisinaPlanine() < this.maxUspon - kolikoManje) {
			return true;
		} else {
			return false;
		}
	}

}
