package by.academy.classwork.lesson15;

//Переделать класс использующий Printable используя ссылку на статический метод.

import by.academy.classwork.lesson15.task1.Printable;

public class Task9 {
	public static void main(String[] args) {
		Printable pr = System.out::println;

		pr.print("Task9");

	}
}
