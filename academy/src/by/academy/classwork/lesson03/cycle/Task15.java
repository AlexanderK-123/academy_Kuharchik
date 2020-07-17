package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task15 {
	public static void main(String... strings) {
		System.out.println("Enter a & b:");
		Scanner in = new Scanner(System.in);
		double a, b;
		a = in.nextDouble();
		b = in.nextDouble();
		while (a % 1 != 0 && b < 0) {
			System.out.println("b can't be negative! Try again:");
			b = in.nextDouble();
		}

		in.close();
		double res = 1;
		for (int i = 1; i <= b; i++) {
			res *= a;
		}
		System.out.println(res);
	}
}
