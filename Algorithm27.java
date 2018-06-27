package algorithms;

public class Algorithm27 {
	
	static void Algorithm(int m) {
		int k = m;
		int n = 1;
		int c = 0;
		for (; k > 1; n++) {
			c = k;
			int q = 1;
			for (; k > 2 * q;) {
				q++;
			}
			if (k == 2 * q) {
				k = q;
			}
			else {
				k = 3 * k + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Algorithm(3);
	}

}
