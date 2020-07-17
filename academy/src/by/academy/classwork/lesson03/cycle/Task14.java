package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task14 {
	public static void main(String... strings) {
		System.out.println("Enter number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i * i;
		}
		System.out.println(s);
	}
}
