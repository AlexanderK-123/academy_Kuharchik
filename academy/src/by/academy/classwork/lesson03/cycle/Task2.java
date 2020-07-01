package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task2 {
	public static void main(String...strings ) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
	
		System.out.println("Sum: " + sum);
		
	}
}
