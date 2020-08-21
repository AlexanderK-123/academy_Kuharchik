package by.academy.homework4.task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] array = { { 1, 2, null }, { 4, 5, 6 }, {}, { 7, 8, 9 }, {} };
		MatrixIterator<Integer> iterator = new MatrixIterator<Integer>(array);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
