package by.academy.homework.lesson5.task3;

public class Main {
	public static void main(String...strings) throws MatrixException {
		
		double[][] a = {{1, 1}, {1, 1}};
		double[][] b = {{2, 2}, {2, 2}};
		Matrix m1 = new Matrix(a);
		Matrix m2 = new Matrix(b);
		m1.print();
		m2.print();
		
		Matrix m3 = Matrix.addition(m1, m2);
		Matrix m4 = Matrix.multiply(m1, m2);
		Matrix m5 = Matrix.multiplyNumber(m1, 6);
		
		m3.print();
		m4.print();
		m5.print();
		
	}
}
