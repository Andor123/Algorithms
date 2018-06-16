package algorithms;

public class Algorithm10 {
	
	static void Algorithm(int n, int m, int j) {
		int k = 0;
		int s = 0;
		int c = 0;
		if (n < m) {
			k = m;
		}
		else {
			k = n;
		}
		for (int i = 0; i < k; i++) {
			int a = n;
			int b = m;
			if (j == 1) {
				s = 1;
			}
			else {
				s = -1;
			}
			c = a + s * b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Algorithm(5,10,1);
	}

}
