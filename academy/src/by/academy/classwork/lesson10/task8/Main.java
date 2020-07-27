package by.academy.classwork.lesson10.task8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 4, 5 };
		Float[] arr2 = { 1.0F, 12.5F, 9.1F };
		MinMax<Integer> m = new MinMax<Integer>(arr);
		MinMax<Float> m2 = new MinMax<Float>(arr2);

		print(m.searchMin());
		print(m.searchMax());
		print(m2.searchMin());
		print(m2.searchMax());

	}

	public static void print(double d) {
		System.out.println(d);
	}
}
