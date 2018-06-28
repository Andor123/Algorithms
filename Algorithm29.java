package algorithms;

public class Algorithm29 {
	
	public static int Algorithm(int[] a) {
		int sum = 1;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			sum *= a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		System.out.println(Algorithm(a));
	}

}
