package by.academy.classwork.lesson03.cycle;

public class Task12 {
	public static void main(String... strings) {
		int res = 1;
		for (int i = 10; i < 100; i++) {
			if (i % 13 == 0 && i % 2 != 0) {
				res *= i;
			}
		}
		System.out.println(res);
	}
}
