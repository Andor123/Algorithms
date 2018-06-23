package algorithms;

public class Algorithm23 {
	
	static void Algorithm(double d, double m, double s, double e) {
		double pi = 3.14;
		double xdeg = d + (m + s / 60) / 60;
		double x = (xdeg * pi) / 180;
		double sinx = 0;
		double z = x;
		int n = 1;
		double B, D = 0;
		if (Math.abs(z) > e) {
			sinx = sinx + z;
			n = n + 2;
			D = n * (n - 1);
			B = (-1) * z * Math.pow(x, 2.0);
			z = B / D;
		}
		System.out.println(sinx);
	}

	public static void main(String[] args) {
		Algorithm(75.0,35.0,35.0,0.0);
	}

}
