package algorithms;

public class Algorithm17 {
	
	static void Algorithm(int n) {
		int a = n;
		int m = 0;
		for (int i = 1; i <= n; i++) {
			m = i;
			int r = 0;
			for (int j = i + 1; j < n; j++) {
				r = m;
				m = a;
				a = r;
				if (a < m) {
					m = j;
				}
			}
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		Algorithm(10);
	}

}
