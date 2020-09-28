package by.academy.classwork.lesson15.task6;

/**
 *  �������� ������ ���������, ������� ��������� �� ���� ������ ���� HeavyBox � 
 *  ������� �� ������� ��������� ���������� ���� � ����� n�. ����������� ���� � ����� n�. 
 *  ���������� �������������� ��������� Consumer � ����� �� ��������� andThen.
 */

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Consumer<HeavyBox> load = box -> System.out.println("��������� ���� � ����� " + box.getN());
		Consumer<HeavyBox> send = box -> System.out.println("���������� ���� � ����� " + box.getN());

		load.andThen(send).accept(new HeavyBox(10));
	}
}
