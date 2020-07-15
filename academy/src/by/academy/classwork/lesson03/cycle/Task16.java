package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task16 {
	public static void main(String...strings) {
		System.out.println("Enter n & m:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		double res = 0;
		for(int i = 1; i <= n; i++) {
			res += m;
		}
		System.out.println(res);
	}
}
