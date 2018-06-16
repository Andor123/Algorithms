package algorithms;

public class Algorithm11 {
	
	static void Algorithm(int n, int m) {
		for (int i = 0; i < n; i++) {
			int a = n;
			int b = m;
			int k = n + m;
			int c = 0;
			for (int j = 0; j < k - n; j++) {
				c = a * b + c;
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		Algorithm(2,3);
	}

}
