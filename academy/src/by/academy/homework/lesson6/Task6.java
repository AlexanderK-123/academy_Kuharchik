package by.academy.homework.lesson6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = in.nextInt();
		String[] s = new String[n];
		System.out.println("Enter " + n + " strings:");
		for (int i = 0; i < n; i++) {
			s[i] = in.next();
		}
		in.close();
		
	}

}
