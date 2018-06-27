package algorithms;

public class Algorithm26 {
	
	static void Algorithm(int m) {
		int n = 2 * m + 1;
		int a = 0;
		int k = 1;
		int i = 1;
		int j = m + 1;
		for (; k < Math.pow(n, 2.0); k++) {
			a = k;
			k = k + 1;
			System.out.println(a);
		}
		for (; j > n; j++) {
			for (; i == 0; i--) {
				i = i + 2;
				j = j - 1;
			}
			i = n;
			j = 1;
			if (a == 0) {
				a = k;
				k = k + 1;
				System.out.println(a);
			}
			else {
				i = i + 2;
				j = j - 1;
			}
		}
	}

	public static void main(String[] args) {
		Algorithm(2);
	}

}
