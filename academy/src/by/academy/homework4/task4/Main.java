package by.academy.homework4.task4;

public class Main {

	public static void main(String[] args) throws CustomException {
		int[] arr = new int[8];

		for (int i = 0; i < 10; i++) {
			try {
				arr[i] = i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array is too small, expand the array");
				throw new CustomException(" My first CustomException!!!");
			}
		}
	}
}
