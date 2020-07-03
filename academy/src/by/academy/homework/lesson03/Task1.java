package by.academy.homework.lesson03;

import java.util.Scanner;

public class Task1 {
	public static void main(String...strings ) {
		
		System.out.println("Enter summ and age:");
		Scanner in = new Scanner(System.in);
		float sum = in.nextFloat();
		while(sum <= 0) {
			System.out.println("Error!!! summ can't be ZERO or NEGATIVE!!! Try arain:");
			sum = in.nextFloat();
		}
		short age = in.nextShort();
		while(age <= 0) {
			System.out.println("Error!!! age can't be ZERO or NEGATIVE!!! Try arain:");
			age = in.nextShort();
		}
		in.close();
		
		if(sum < 100) {
			System.out.printf("\nSum = %.2f", sum * 0.95);
		}
		if(sum >= 100 && sum < 200) {
			System.out.printf("\nSum = %.2f", sum * 0.93);
		}
		if(sum >= 200 && sum < 300) {
			if(age >= 18) {
				System.out.printf("\nSum = %.2f", sum * 0.84);
			}
			else {
				System.out.printf("\nSum = %.2f", sum * 0.91);
			}
		}
		if(sum >= 300 && sum < 400) {
			System.out.printf("\nSum = %.2f", sum * 0.85);
		}
		if(sum >= 400) {
			System.out.printf("\nSum = %.2f", sum * 0.8);
		}
		
	}
}
