package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task4 {
	public static void main(String... strings) {
		System.out.println("Enter number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c_pos = 0;
		int c_neg = 0;
		int c_null = 0;
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a > 0) {
				c_pos++;
			} else {
				if (a < 0) {
					c_neg++;
				} else {
					c_null++;
				}
			}
		}
		in.close();
		System.out.println("Count positive: " + c_pos + "; Count negative: " + c_neg + "; Count null: " + c_null);
	}
}
