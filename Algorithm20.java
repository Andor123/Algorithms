package algorithms;

public class Algorithm20 {
	
	static void Algorithm() {
		double e = 0;
		double d = 0;
		int n = 0;
		int a = 0;
		n = n + 1;
		if (a == 0) {
			e = e / n;
			d = d / n + Math.pow(e, 2.0);
			d = Math.pow(d, 0.5);
			System.out.println(e + " " + d + " " + n);
		}
		else {
			d = a * a + d;
			e = a + e;
			System.out.println(e + " " + d + " " + n);
		}
	}

	public static void main(String[] args) {
		Algorithm();
	}

}
