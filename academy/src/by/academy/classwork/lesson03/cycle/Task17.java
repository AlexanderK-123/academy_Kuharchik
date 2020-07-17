package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task17 {
	public static void main(String... strings) {
		System.out.println("Enter n:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double height = 0.0;
		double res = 0.0;
		System.out.println("Enter height:");
		for (int i = 0; i < n; i++) {
			height += in.nextDouble();
		}
		in.close();
		res = height / (double) n;
		System.out.println(res);
	}
}
