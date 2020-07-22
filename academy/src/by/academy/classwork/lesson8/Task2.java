package by.academy.classwork.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String... strings) {

		String[] tests = { "01/02/1990", "0-102-1990", "43/11/1990", "49-9-2020" };

		Pattern p1 = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0]?[1-9]|[1][0-2])/\\d{4}");
		Pattern p2 = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|[1][0-2])-\\d{4}");

		for (String t : tests) {
			Matcher m1 = p1.matcher(t);
			Matcher m2 = p2.matcher(t);
			if (m1.find()) {
				System.out.println(m1.group(0));
			} else if (m2.find()) {
				System.out.println(m2.group(0));
			} else {
				System.out.println("failed");
			}
		}
	}

//	public static boolean isValidDataString(String stringDate) {
//		//Matcher m1 = p1.matcher(stringDate);
//		
//	}
}
