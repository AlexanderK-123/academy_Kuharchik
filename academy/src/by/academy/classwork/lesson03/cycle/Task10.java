package by.academy.classwork.lesson03.cycle;

public class Task10 {
	public static void main(String...strings) {
		int s = 0;
		for(int i = 1; i < 51; i++) {
			if(i % 7 == 0 || i % 5 == 0) {
				s+=i;
			}
		}
		System.out.println("Summ: " + s);
	}
}
