package algorithms;

public class Algorithm6 {
	
	static void Algorithm(int a, int b, int c, int d, int e) {
		b = a + b;
		c = b + c;
		d = c + d;
		e = d + e;
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}

	public static void main(String[] args) {
		Algorithm(1,2,3,4,5);
	}

}
