package algorithms;

public class Algorithm32 {
	
	public static Boolean Algorithm(int[] a) {
		Boolean result = false;
		int n = a.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				result = true;
			}
			else if (a[i] < max) {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {1,3,2,4,5,7,6,8};
		System.out.println(Algorithm(a));
	}

}
