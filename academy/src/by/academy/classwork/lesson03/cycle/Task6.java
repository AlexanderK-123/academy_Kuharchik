package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task6 {
	public static void main(String...strings) {
		System.out.println("Enter summ:");
		Scanner in = new Scanner(System.in);
		double s = in.nextDouble();
		System.out.println("Enter year:");
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			s+=s*0.03;
		}
		System.out.println("Result: " + s);
		in.close();
	}
}
