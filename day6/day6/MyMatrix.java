package day6;
public class MyMatrix {
    int [][] matrix;

    public MyMatrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                matrix[r][c] = 1;
            }
        }    
    }

    public void setElement(int r, int c, int newelem) {
        if (isValid(r, c)) {
            matrix[r][c] = newelem;
        }
    }

    public boolean isValid(int r, int c) {
        return (r < matrix.length && c < matrix[0].length);
    }

    public void setRow(int r, String str ) {
        String[] newRow = str.split(",");
        if (r < matrix.length && newRow.length == matrix[0].length) {
            for (int c = 0; c < matrix[0].length; c++ ) {
                setElement(r, c, Integer.parseInt(newRow[c]));
            }
        }
    }

    public void setColumn(int c, String str ) {
        String[] newColumn = str.split(",");
        if (c < matrix[0].length && newColumn.length == matrix.length) {
            for (int r = 0; r < matrix.length; r++ ) {
                setElement(r, c, Integer.parseInt(newColumn[r]));
            }
        }
    }

    public String toString () { 
        String matrixString = "[";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
            	matrixString = matrixString + matrix[r][c];
            	if (c < matrix[0].length-1) {
            		matrixString = matrixString + ",";
            	}
            }
            if (r < matrix.length - 1) {
            	matrixString = matrixString + ";";
            }
        }
        matrixString = matrixString + "]";
        return matrixString;
    }

    public void prettyPrint() {
        for (int r = 0; r < matrix[0].length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print("" + matrix[r][c] + "|");
            }
                System.out.println();
        }
    }
    
    public void setMatrix(String elements) {
    	String[] rows = elements.split(";");
    	for (int r = 0; r < rows.length; r++) {
    		setRow(r, rows[r]);
    	}
    }
    
    public boolean isSymmetrical() {
    	return MatrixChecker.isSymmetrical(matrix);
    }
    
    public boolean isTriangular() {
    	return MatrixChecker.isTriangular(matrix);
    }
    
    public static void main (String args[]) {
    	MyMatrix matrixTest = new MyMatrix(3,3);
    	matrixTest.prettyPrint();
    	if (matrixTest.isSymmetrical()) {
    		System.out.println("This matrix is symmetrical.");
    	}
    	System.out.println();
    	System.out.println(matrixTest.toString());
    	System.out.println();
    	matrixTest.setColumn(1,"0,0,0");
    	matrixTest.prettyPrint();
    	System.out.println();
    	matrixTest.setRow(1,"3,3,3");
    	matrixTest.prettyPrint();
    	System.out.println();
    	matrixTest.setMatrix("1,2,3;4,5,6;7,8,9");
    	matrixTest.prettyPrint();
    	if (!matrixTest.isSymmetrical()) {
    		System.out.println("This matrix is not symmetrical");
    	}
    	matrixTest.setMatrix("1,0,0;4,5,0;7,8,9");
    	matrixTest.prettyPrint();
    	if (matrixTest.isTriangular()) {
    		System.out.println("This matrix is triangular");
    	}
    	
    }
}