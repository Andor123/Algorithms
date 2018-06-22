package algorithms;

public class Algorithm18 {
	
	static void Algorithm(int n) {
		int a = n;
		for (int i = 0; i <= n; i++) {
			int sig = 0;
			int r = 0;
			for (int j = i + 1; j < n; j++) {
				r = j;
				j = a;
				a = r;
				sig = sig + 1;
			}
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		Algorithm(10);
	}

}
