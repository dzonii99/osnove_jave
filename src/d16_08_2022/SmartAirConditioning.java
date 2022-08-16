package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public int temp;
	public String mod;

	public void print() {
		System.out.println("Vasa klima " + this.marka + " radi na " + this.temp + "°C i " + this.mod);
		for (int i = 0; i < this.temp; i++) {
			System.out.print("|");
		}
		System.out.println();
	}

	public boolean hot(int outsideTemp) {
		if (outsideTemp > this.temp) {
			return true;
		}
		return false;
	}

}
