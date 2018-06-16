package algorithms;

public class Algorithm5 {
	
	static void IntegerValue(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		IntegerValue(array);
	}

}
