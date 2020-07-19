package by.academy.homework.lesson6;

import java.util.Scanner;

public class Task1 {
	public static void main(String... strings) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		String[] s = new String[n];
		System.out.println("Enter " + n + " strings:");
		for (int i = 0; i < n; i++) {
			s[i] = in.next();
		}
		in.close();
		String maxS = s[0], minS = s[0];
		int maxL = s[0].length(), minL = s[0].length();
		for (int i = 0; i < n; i++) {
			if (maxL < s[i].length()) {
				maxS = s[i];
				maxL = s[i].length();
			}
			if (minL > s[i].length()) {
				minS = s[i];
				minL = s[i].length();
			}
		}
		System.out.println("Max string: " + maxS + "; length: " + maxL);
		System.out.println("Min string: " + minS + "; length: " + minL);
	}
}
