package by.academy.classwork.lesson15.task1;

/**
 * Написать лямбда выражение для интерфейса Printable, который содержит один
 * метод void print().
 */

public class Main implements Printable {

	public static void main(String[] args) {
		Printable p = s -> System.out.println(s);
		String s = "String";
		p.print(s);
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}

}
