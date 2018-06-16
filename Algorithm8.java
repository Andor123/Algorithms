package algorithms;

public class Algorithm8 {
	
	static void Algorithm(double A, double n) {
		double S = 1;
		if (n == 0) {
			S = Math.pow(A, n);
			System.out.println(S);
		}
		else {
			n = n - 1;
			S = A * S;
		}
	}

	public static void main(String[] args) {
		Algorithm(5.0,0.0);
	}

}
