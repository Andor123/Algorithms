package algorithms;

public class Algorithm25 {
	
	static void Algorithm(double x) {
		double[] a = new double[] {1.0,2.0,3.0,4.0,5.0};
		int n = a.length;
		if (a[0] > x) {
			System.out.println("Error");
		}
		else if (a[n - 1] < x) {
			System.out.println("Error");
		}
		int k = 1;
		if (k < n) {
			k = 2 * k;
		}
		else {
			k = k / 2;
		}
		int l = k;
		if (a[k] < x) {
			if (l == 1) {
				k = k + 1;
				System.out.println(k);
			}
			else {
				l = l / 2;
				k = k + l;
				if (k > n) {
					l = l / 2;
					k = k - l;
				}
			}
		}
		else if (a[k] > x) {
			if (l == 1) {
				k = k - 1;
				System.out.println(k);
			}
			else {
				l = l / 2;
				k = k - l;
			}
		}
		else {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		Algorithm(3.0);
	}

}
