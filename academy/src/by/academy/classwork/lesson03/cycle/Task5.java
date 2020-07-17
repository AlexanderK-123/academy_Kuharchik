package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task5 {
	public static void main(String... strings) {
		System.out.println("Enter number:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i = 1; i < 10; i++) {
			a += a;
		}

		in.close();
	}
}
