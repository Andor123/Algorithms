package algorithms;

public class Algorithm14 {
	
	static void Algorithm() {
		int[][] a = new int[][] {
			{18,17,16},
			{15,14,13}
		};
		int[][] b = new int[][] {
			{12,11,10,9},
			{8,7,6,5},
			{4,3,2,1}
		};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length + 1; j++) {
				int[][] c = new int[2][4];
				for (int p = 0; p < b.length; p++) {
					c[i][j] = a[i][p] - b[p][j] + c[i][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Algorithm();
	}

}
