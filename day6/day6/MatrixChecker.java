package day6;

public class MatrixChecker {

	public static boolean isSymetrical(int[] row) {
		int high = row.length-1;
		for (int low = 0; low < high; low++, high--) {
			if (row[low] != row[high]) {
				return false;
			}		
		}
		return true;
	}

	public static boolean isSymmetrical(int[][] matrix) {
		if (!isSquare(matrix)) {
			return false;
		}
		int width = matrix.length;
		if (width < 2) {
			return true;
		}
		for (int row = 1; row < width; row++) {
			for (int col = 0; col <= row; col++) {
				if (matrix[row][col] != matrix [col][row]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isSquare(int[][] matrix) {
		int width = matrix.length;
		return width < 1 || matrix[0].length == width;
	}
	
	public static boolean isTriangular(int[][] matrix) {
		if (!isSquare(matrix)) {
			return false;
		}
		int width = matrix.length;
		if (width < 2) {
			return true;
		}
		for (int row = 0; row < width-1; row++) {
			for (int col = row+1; col < width; col++) {
				if (matrix[row][col] != 0) {
					return false; 
				}
			}
		}
		return true;
	}
}