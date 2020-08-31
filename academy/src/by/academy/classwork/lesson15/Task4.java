package by.academy.classwork.lesson15;

/**
 * Ќаписать программу провер€ющую, что строка не null и не пуста, 
 * использу€ метод and() функционального интерфейса Predicate. 
 */

import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {

		Predicate<String> predNotNull = s -> s != null;
		Predicate<String> predNotEmpty = s -> !s.equals("");

		System.out.println(predNotNull.and(predNotEmpty).test("String"));
		System.out.println(predNotNull.and(predNotEmpty).test(""));
		System.out.println(predNotNull.and(predNotEmpty).test(null));
	}

}
