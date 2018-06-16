package algorithms;

public class Algorithm4 {
	
	static void StringValue(String[] array) {
		int n = array.length;
		int counter1 = 0, counter2 = 0, counter3 = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == "A") {
				counter1++;
			}
			if (array[i] == "B") {
				counter2++;
			}
			if (array[i] == "C") {
				counter3++;
			}
		}
		System.out.println("Number of 'A' in the array: " + counter1);
		System.out.println("Number of 'B' in the array: " + counter2);
		System.out.println("Number of 'C' in the array: " + counter3);
	}

	public static void main(String[] args) {
		String[] chars = new String[] {"A", "B", "C", "A", "B", "A"};
		StringValue(chars);
	}

}
