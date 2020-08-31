package by.academy.classwork.lesson15;

/**
 *  Написать лямбда выражение, которое принимает на вход число и возвращает значение 
 *  “Положительное число”, “Отрицательное число” или  “Ноль”.
 *  Используем функциональный интерфейс Function.
 */

import java.util.function.Function;

public class Task7 {
	public static void main(String[] args) {

		Function<Integer, String> func = i -> (i == 0) ? "Zero" : (i > 0) ? "Positive" : "Negative";

		System.out.println(func.apply(1));
		System.out.println(func.apply(-1));
		System.out.println(func.apply(0));
	}
}
