package by.academy.classwork.lesson15;

/**
 *  �������� ������ ���������, ������� ���������� ��������� ����� �� 0 �� 10. 
 *  ���������� �������������� ��������� Supplier.
 */

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
	public static void main(String[] args) {

		Supplier<Integer> supl = () -> new Random().nextInt(10);

		System.out.println(supl.get());
	}
}
