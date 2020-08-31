package by.academy.classwork.lesson15.task10;

/**
 *  Создать программу-калькулятор, в которую мы передаем 2 числа и оператор (+,-,*,/).
 *  Написать свой функциональный интерфейс для вычисления.
 *  Использовать лямбды.
 */

import java.util.HashMap;
import java.util.Map;

public class CalculatorDemo {

	public static void main(String[] args) {
		Map<String, CalculatorFunction> catalog = new HashMap<>();

		catalog.put("+", (a, b) -> a + b);
		catalog.put("-", (a, b) -> a - b);
		catalog.put("*", (a, b) -> a * b);
		catalog.put("/", (a, b) -> a / b);

		double a = 5, b = 9;

		System.out.println(catalog.get("+").calc(a, b));
		System.out.println(catalog.get("-").calc(a, b));
		System.out.println(catalog.get("*").calc(a, b));
		System.out.println(catalog.get("/").calc(a, b));
	}

}
