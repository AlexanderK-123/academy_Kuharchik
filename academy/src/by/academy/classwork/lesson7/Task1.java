package by.academy.classwork.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		String s = " ����� � ������ �� ������ �������, �� � ������ ����� ����������. ����������\r\n"
				+ "����� �� ����������";
		Pattern p = Pattern.compile("[.,?!]");
		Matcher m = p.matcher(s);
		int counter = 0;
		while (m.find()) {
			counter++;
		}

		System.out.println("Counter: " + counter);
	}

}
