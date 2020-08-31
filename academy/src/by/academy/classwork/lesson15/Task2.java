package by.academy.classwork.lesson15;

/**
 * ������� ������ ���������, ������� ���������� �������� true, ���� ������ ��
 * null, ��������� �������������� ��������� Predicate.
 */

import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {

		Predicate<String> pred = s -> s != null;

		System.out.println(pred.test("String"));
		System.out.println(pred.test(null));
	}
}
