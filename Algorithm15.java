package algorithms;

public class Algorithm15 {
	
	static void Algorithm(int a, int b, int c) {
		int m = 0;
		if (b < a) {
			m = a;
			a = b;
			b = m;
		}
		else if (c < b) {
			m = c;
			c = b;
			if (m < a) {
				b = a;
				a = m;
			}
			else {
				b = m;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		Algorithm(3,2,1);
	}

}
