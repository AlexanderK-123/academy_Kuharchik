package by.academy.classwork.lesson15;

/**
 * —оздать л€мбда выражение, которое провер€ет, что строка не пуста, 
 * использу€ функциональный интерфейс Predicate.
 */

import java.util.function.Predicate;

public class Task3 {
	public static void main(String[] args) {

		Predicate<String> pred = s -> !s.equals("");

		System.out.println(pred.test("String"));
		System.out.println(pred.test(""));
	}
}
