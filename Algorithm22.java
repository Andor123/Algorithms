package algorithms;

public class Algorithm22 {
	
	static void Algorithm() {
		double atgx = Math.atan(1.0 / 8.0);
		double a = 24 * atgx;
		atgx = Math.atan(1.0 / 57.0);
		double b = 8 * atgx;
		atgx = Math.atan(1.0 / 239.0);
		double c = 4 * atgx;
		double pi = a + b + c;
		System.out.println(pi);
	}

	public static void main(String[] args) {
		Algorithm();
	}

}
