package by.academy.homework2;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 lines of even length:");
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		while (s1.length() % 2 != 0 || s2.length() % 2 != 0) {
			System.out.println("Incorrect length of lines! Try again! Enter 2 lines of even length:");
			s1 = in.nextLine();
			s2 = in.nextLine();
		}
		in.close();
		StringBuffer res = new StringBuffer();
		if (s1.length() == s2.length()) {
			equalLength(res, s1, s2);
		} else {
			for (int i = 0; i < s1.length() / 2; i++) {
				res.append(s1.charAt(i));
			}
			for (int i = s2.length() / 2; i < s2.length(); i++) {
				res.append(s2.charAt(i));
			}
		}
		System.out.println(res);
	}

	public static StringBuffer equalLength(StringBuffer res, String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (i < s1.length() / 2) {
				res.append(s1.charAt(i));
			} else {
				res.append(s2.charAt(i));
			}
		}
		return res;
	}

}
