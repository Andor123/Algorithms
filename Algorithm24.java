package algorithms;

public class Algorithm24 {
	
	static void Algorithm(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 2; j < n; j++) {
				int m = n;
				int c = 0;
				int d = 0;
				int q = 1;
				for (; q * i < m; q++) {
					d = 0;
					if (i > Math.pow(n, 0.5)) {
						System.out.println(n);
					}
				}
				m = q;
				d = i;
				c = 1 + c;
				if (m == 1) {
					int k = 1;
					for (; k < j; k++) {					
						System.out.println(d + " " + c);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Algorithm(10);
	}

}
