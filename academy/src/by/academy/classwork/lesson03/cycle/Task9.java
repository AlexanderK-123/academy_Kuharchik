package by.academy.classwork.lesson03.cycle;

public class Task9 {
	public static void main(String...strings) {
		for(int i = 35; i < 88; i++) {
			if(i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
				System.out.printf("%d ",i);
			}
		}
	}
}
