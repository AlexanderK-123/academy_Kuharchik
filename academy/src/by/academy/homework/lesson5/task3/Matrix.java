package by.academy.homework.lesson5.task3;

public class Matrix {
	private int row;
	private int col;
	private double[][] matrix;
	Matrix mat;
	
	
	public Matrix(){
		this.row = 1;
		this.col = 1;
        this.matrix = new double[row][col];
		
	}
	
	public Matrix(int row, int col) throws MatrixException {

        if(row <= 0 || col <= 0) {
            throw new MatrixException("Заданы неверные размеры матрицы!!!");
        }

        this.row = row;
        this.col = col;
        this.matrix  = new double[row][col];
    }
	
	public Matrix(int size) throws MatrixException {
		if(size <= 0) {
            throw new MatrixException("Заданы неверные размеры матрицы!!!");
        }

        this.row = this.col = size;
        this.matrix = new double[size][size];
	}
	
	public Matrix(double[][] matrix) {
        this.row = matrix.length;
        this.col = matrix[0].length;
        this.matrix = matrix;
    }
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setCol(int col) {
		this.col = col;
	}
	
	public final boolean isSquare() {
        return row == col;
    }
	
	 public final void fill(double n) {
	        for(int i = 0; i < row; i++) {
	            for(int j = 0; j < col; j++) {
	                matrix[i][j] = n;
	            }
	        }
	    }
	
	public final void print() {

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	
	public static final Matrix addition(Matrix matrix1, Matrix matrix2) throws MatrixException {
	    if (matrix1.row != matrix2.row || matrix1.col != matrix2.col) {
	        throw new MatrixException("Размеры матриц не совпадают");
	    } else {
	        Matrix matrix = new Matrix(matrix1.row, matrix1.col);
	        for(int i = 0; i < matrix1.row; i++) {
	            for(int j = 0; j < matrix1.col; j++) {
	                matrix.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
	            }
	        }
	        return matrix;
	    }
	}
	
	public static final Matrix multiply(Matrix matrix1, Matrix matrix2) throws MatrixException {

        if(matrix1.col != matrix2.row) {
        	if(matrix2.col != matrix1.row) {
        		throw new MatrixException("Размеры матриц не совпадают");
        	}
        	else {
        		Matrix matrix = new Matrix(matrix2.row, matrix1.col);
        		for(int i = 0; i < matrix2.row; i++) {
    	            for(int j = 0; j < matrix1.col; j++) {
    	            	for(int k = 0; k < matrix2.col; k++) {
    	            		matrix.matrix[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
    	            	}
    	            }
    	        }
    	        return matrix;
        	}
        }
        else {
        	Matrix matrix = new Matrix(matrix1.row, matrix2.col);
    		for(int i = 0; i < matrix1.row; i++) {
	            for(int j = 0; j < matrix2.col; j++) {
	            	for(int k = 0; k < matrix1.col; k++) {
	            		matrix.matrix[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
	            	}
	            }
	        }
    		return matrix;
    	}
	}
	
	public static final Matrix multiplyNumber(Matrix matrix1, double n) throws MatrixException {
		Matrix matrix = new Matrix(matrix1.row, matrix1.col);
		for(int i = 0; i < matrix1.row; i++) {
			for(int j = 0; j < matrix1.col; j++) {
				matrix.matrix[i][j] = matrix1.matrix[i][j]*n;
			}
		}
    	return matrix;
	}
}

