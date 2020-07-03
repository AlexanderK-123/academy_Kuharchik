package by.academy.homework.lesson03;

public class Task4 {
	public static void main(String...strings ) {
		int a = 2;
		byte i = 2;
		System.out.println("2 ^ 0 = 1\n2 ^ 1 = 2");
		while(a < 1_000_000) {
			a*=2;
			System.out.printf("%d ^ %d = %d\n", 2, i++, a);
		}
	}
}
