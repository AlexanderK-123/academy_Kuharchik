package by.academy.classwork.lesson13.task3;

public class Main {

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		CustomIterator<Integer> iterator = new CustomIterator<Integer>(array);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
