package algorithms;

public class Algorithm7 {
	
	static void Algorithm(int a, int b, int c, int d, int e) {
		double r = 0;
		if (a > b) {
			r = Math.pow((c + d), e);
		}
		else if (a < b) {
			r = c + d + e;
		}
		else {
			r = c * d * e;
		}
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + r);
	}

	public static void main(String[] args) {
		Algorithm(1,2,3,4,5);
	}

}
