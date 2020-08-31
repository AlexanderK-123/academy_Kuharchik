package by.academy.classwork.lesson15;

/**
 * —оздать л€мбда выражение, которое возвращает значение true, если строка не
 * null, использу€ функциональный интерфейс Predicate.
 */

import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {

		Predicate<String> pred = s -> s != null;

		System.out.println(pred.test("String"));
		System.out.println(pred.test(null));
	}
}
