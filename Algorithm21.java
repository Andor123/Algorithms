package algorithms;

public class Algorithm21 {
	
	static void Algorithm(double x, double e) {
		double atgx = 0.0;
		double z = x;
		double b = 0.0;
		int n = 1;
		if (Math.abs(z) < e) {
			atgx = atgx + 1;
			n = n + 2;
			b = (-1) * z * Math.pow(x, 2.0);
			z = b / n;
		}
		System.out.println(atgx);
	}

	public static void main(String[] args) {
		Algorithm(5.0,10.0);
	}

}
