package algorithms;

public class Algorithm31 {
	
	public static String Algorithm(String[] a) {
		String result = "";
		int n = a.length;
		for (int i = 0; i < n; i++) {
			result += a[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] a = {"H","e","l","l","o"};
		System.out.println(Algorithm(a));
	}

}
