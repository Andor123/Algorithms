package algorithms;

public class Algorithm3 {
	
	static void SwitchValue(int value) {
		String result = "";
		switch (value) {
		case 1:
			result = "1st Place";
			break;
		case 2:
			result = "2nd Place";
			break;
		case 3:
			result = "3rd Place";
			break;
		default:
			result = "4th Place or worse";
			break;
		}
		System.out.println("Finished in: " + result);
	}

	public static void main(String[] args) {
		SwitchValue(1);
	}

}
