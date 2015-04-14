import java.util.ArrayList;

public class EightDames {
	private boolean[] columns;
	private boolean[] diagonalNeg;
	private boolean[] diagonalPos;

	public EightDames() {
 		columns = new boolean[8];
		diagonalNeg = new boolean[15];
		diagonalPos = new boolean[15];
		for ( int i = 0; i < 15; i++) {
			this.diagonalPos[i] = false;
			this.diagonalNeg[i] = false;
		}
		for ( int i = 0; i < 8; i++) {
			this.columns[i] = false;
		}
	}

	public ArrayList<Integer> solve (ArrayList<Integer> cols) {
		int row = cols.size();
		if (row == 8) {
			return cols;
		}
		for (int col = 0; col < 8; col++) {
			if (isFree(row, col)) {
				placeQueen(row, col);
				cols.add(col);
				ArrayList <Integer> result = solve(cols);
				if (result != null) {
					return cols;
				}
				removeQueen(row, col);
				cols.remove(row);
			}
		}
		return null;
	}

	public boolean isFree(int row, int col) {
		return (!this.columns[col] && !this.diagonalPos[row + col] 
			&& !this.diagonalNeg[7 + row - col]);
	}

	public void placeQueen(int row, int col) {
		columns[col] = true;
		diagonalPos[row + col] = true;
		diagonalNeg [7 + row - col] = true;
	}

	public void removeQueen (int row, int col) {
		columns[col] = false;
		diagonalPos[row + col] = false;
		diagonalNeg [7 + row - col] = false;
	}

	public static void main (String args[]) {
		EightDames aBoard = new EightDames();
		ArrayList <Integer> start = new ArrayList<Integer>();
		ArrayList <Integer> result = aBoard.solve(start);
		System.out.println(result.toString());

	}
}