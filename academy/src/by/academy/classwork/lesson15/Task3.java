package by.academy.classwork.lesson15;

/**
 * ������� ������ ���������, ������� ���������, ��� ������ �� �����, 
 * ��������� �������������� ��������� Predicate.
 */

import java.util.function.Predicate;

public class Task3 {
	public static void main(String[] args) {

		Predicate<String> pred = s -> !s.equals("");

		System.out.println(pred.test("String"));
		System.out.println(pred.test(""));
	}
}
