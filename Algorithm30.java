package algorithms;

public class Algorithm30 {
	
	public static int Algorithm(int[] a, int[] b) {
		int sum1 = 1;
		int sum2 = 1;
		int sum = 0;
		int n = a.length;
		int m = b.length;
		for (int i = 0; i < n; i++) {
			sum1 *= a[i];
		}
		for (int j = 0; j < m; j++) {
			sum2 *= b[j];
		}
		sum = sum1 + sum2;
		return sum;
	}

	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		int[] b = {4,4,3,2,1};
		System.out.println(Algorithm(a,b));
	}

}
