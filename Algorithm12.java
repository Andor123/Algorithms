package algorithms;

public class Algorithm12 {
	
	static void Algorithm() {
		int[][] a = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Algorithm();
	}

}
