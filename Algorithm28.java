package algorithms;

public class Algorithm28 {
	
	static long Algorithm(int n) {
		if (n <= 1)
			return n;
		else
			return Algorithm(n-1) + Algorithm(n-2);
	}

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i <= n; i++) {
			System.out.println(Algorithm(i));
		}
	}

}
