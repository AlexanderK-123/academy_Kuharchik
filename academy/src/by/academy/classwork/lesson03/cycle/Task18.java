package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				count++;
			}
		}
		in.close();
		System.out.println(count);

	}

}
