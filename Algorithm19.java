package algorithms;

public class Algorithm19 {
	
	static void Algorithm(int n) {
		double e = 0;
		double d = 0;
		for (int i = 1; i < n; i++) {
			double a = i;
			e = a + e;
			d = a * a + d;
			System.out.println(e + " " + d);
		}
		e = e / n;
		d = d / n + Math.pow(e, 2.0);
		System.out.println(e + " " + d);
		d = Math.pow(d, 0.5);
		System.out.println(e + " " + d);
	}

	public static void main(String[] args) {
		Algorithm(10);
	}

}
