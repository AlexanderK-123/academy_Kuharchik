package by.academy.classwork.lesson7;

public class Task2 {

	public static void main(String[] args) {
		String s = "������� ������ � �������. ���������� ���������� ���� � ������. ����������\r\n"
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����\r\n"
				+ "������ ����� ����� ���� �������, �� ����� � �������������.";

		String[] str = s.split("\\s+");
		System.out.println(str.length);
		for (String e : str) {
			System.out.println(e);
		}
	}

}
