package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task3 {
	public static void main(String...strings) {
		System.out.println("Enter number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 1;
		in.close();
		for(int i = a; i <= n; i++) {
			a*=i;
		}
		System.out.println("Result: " + a);
	}
}
