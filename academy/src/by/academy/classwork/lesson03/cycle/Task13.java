package by.academy.classwork.lesson03.cycle;

public class Task13 {
	public static void main(String... strings) {
		int res = 0;
		for (int i = 100; i < 201; i++) {
			if (i % 17 == 0) {
				res += i;
			}
		}
		System.out.println(res);
	}
}
