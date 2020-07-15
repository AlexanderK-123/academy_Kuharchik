package by.academy.classwork.lesson03.cycle;

public class Task11 {
	public static void main(String...strings) {
		for(int i = 10; i < 100; i++) {
			if(i % 4 == 0 && i % 6 != 0) {
				System.out.printf("%d ",i);
			}
		}
	}
}
