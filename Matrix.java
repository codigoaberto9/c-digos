package challenge;

public class Matrix {

	public int[][] populateMatrixEven(int matrixSize) {
		int par = 1;

		int[][] matrix = new int[matrixSize][matrixSize];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {

				while (par % 2 != 0) {
					par++;

				}
				matrix[i][j] = par;
				par++;
			}

		}

		return matrix;
	}

	public int[][] populateMatrixOdd(int matrixSize) {
		int par = 1;
		double x;	
		int[][] matrix = new int[matrixSize][matrixSize];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {

				while (par % 2 == 0) {
					par++;

				}
				matrix[i][j] = par;
				par++;
			}

		}

		return matrix;
	}

}
