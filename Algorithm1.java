package algorithms;

public class Algorithm1 {
	
	static void SumValue(int[] array) {
		int result = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			result += array[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5};
		SumValue(numbers);
	}

}
