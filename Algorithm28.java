package algorithms;

public class Algorithm28 {
	
	static void Algorithm(int n, int[] m) {
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 1;
			b[i] = 1;
		}
		for (int i = 0; i < m.length; i++) {
			a[i] = 0;
			for (int j = 0; j < n; j++) {
				a[i] = a[i] + b[j] * a[Math.abs(i-n+j)];
			}
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {3,4,5};
		Algorithm(2,numbers);
	}

}
