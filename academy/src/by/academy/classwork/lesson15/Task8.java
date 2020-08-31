package by.academy.classwork.lesson15;

/**
 *  Написать лямбда выражение, которое возвращает случайное число от 0 до 10. 
 *  Используем функциональный интерфейс Supplier.
 */

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
	public static void main(String[] args) {

		Supplier<Integer> supl = () -> new Random().nextInt(10);

		System.out.println(supl.get());
	}
}
