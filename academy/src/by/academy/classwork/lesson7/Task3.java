package by.academy.classwork.lesson7;

public class Task3 {

	public static void main(String[] args) {
		String s = "������� ������ � �������. ������� �����, ������������ �� ��������� ����\r\n" + 
				"���� ����";
		String[] str = s.split("\\s+");
		String res = "";
		for (String e : str) {
			res += e.charAt(e.length() - 1);
		}
		System.out.println(res);
	}

}
