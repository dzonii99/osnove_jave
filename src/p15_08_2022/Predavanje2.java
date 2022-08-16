package p15_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
		int z = sumiraj(10, 20);
//		double x = multiply(10, 4);
//		System.out.println(x);
	}

// 	void => nemam povratnu vrednost
//	int
//	double
//	String
//	char
//	ArrayList<String>
	public static int sumiraj(int a, int b) {
//		int zbir = a + b;
		if (a > 5) {
			return a + b;
		}
		return 0;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

}
