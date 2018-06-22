package algorithms;

public class Algorithm16 {
	
	static void Algorithm(int n) {
		int min = n;
		int a = 0;
		for (int i = 1; i <= n; i++) {
			min = i;
			int r = 0;
			for (int j = i + 1; j < n; j++) {
				if (a < min) {
					r = a;
					a = min;
					min = r;
				}
			}
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		Algorithm(10);
	}

}
