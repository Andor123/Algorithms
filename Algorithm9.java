package algorithms;

public class Algorithm9 {
	
	static void Algorithm(double Z, double e) {
		double a = Z + 1;
		double V = (a + Z / a) / 2;
		if (Math.abs(a-V) < e) {
			V = Math.sqrt(Z);
			System.out.println(V);
		}
		else {
			a = V;
		}
	}

	public static void main(String[] args) {
		Algorithm(5.0,5.0);
	}

}
