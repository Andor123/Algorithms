package algorithms;

public class Algorithm2 {
	
	static void SumDiv2Value(int[] array) {
		int n = array.length;
		int result1 = 0, result2 = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				result1 += array[i];
			}
			if (array[i] % 2 != 0) {
				result2 += array[i];
			}
		}
		System.out.println(result1 + " " + result2);
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
		SumDiv2Value(numbers);
	}

}
