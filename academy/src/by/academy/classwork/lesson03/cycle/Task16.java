package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task16 {
	public static void main(String... strings) {
		System.out.println("Enter n & m:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double m = in.nextInt();
		double k = 1.0 / 6.0;
		in.close();
		double res = 0.0;
		for (int i = 1; i < n; i++) {
			res += m + (k * (double) i);
		}
		System.out.println(res);
	}
}
