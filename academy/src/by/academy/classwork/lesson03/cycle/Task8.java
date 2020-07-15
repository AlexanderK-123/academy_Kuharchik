package by.academy.classwork.lesson03.cycle;

public class Task8 {
	public static void main(String...strings) {
		for(int i = 20; i < 51; i++) {
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.printf("%d ",i);
			}
		}
	}
}
