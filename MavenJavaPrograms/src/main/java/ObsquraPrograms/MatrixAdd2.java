package ObsquraPrograms;

public class MatrixAdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;

		int a[][] = { { 1, 2 }, { 2, 3 }, { 5, 6 } };
		int b[][] = { { 2, 3 }, { 3, 4 }, { 8, 9 } };
		int c[][] = new int[3][2];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
