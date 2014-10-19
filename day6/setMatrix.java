public class Matrix {
    int [][] matrix;

    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                matrix[r][c] = 1;
            }
        }    
    }

    public void setElement(int r, int c, int newelem) {
        if (isValid(r, c)) {
            matrix[i][j] = newelem;
        }
    }

    public boolean isValid(int r, int c) {
        return (r < matrix.length && c < matrix[0].length);
    }

    public void setRow(int r, String str ) {
        String[] newRow = str.split(str, ",");
        if (r < matrix.length && newRow.length == matrix[0].length) {
            for (int c = 0; c < matrix[0].length; c++ ) {
                setElement(r, c, Integer.parseInt(newRow[c]));
            }
        }
    }

    
    public void setColumn(int c, String str) {
        String[] newColumn = str.split(str, ",");
        if (c < matrix[0].length && newColumn.length == matrix.length) {
            for (int r = 0; r < matrix.length; r++ ) {
                newColumn[] = Integer.parseInt(newRow[i]);
                 setElement(r, c, Integer.parseInt(newColumn[r]));
            }
        }
    }

    public void setMatrix(int r, int c, String str) {
        String[] newColumn = str.split(str, ";");
        if (c < matrix[0].length && newColumn.length == matrix.length) {
            for (int r = 0; r < matrix.length; r++ ) {
                setRow (r, newColumn);
            }
    }
}