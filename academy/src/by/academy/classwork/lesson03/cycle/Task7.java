package by.academy.classwork.lesson03.cycle;

import java.util.Scanner;

public class Task7 {
	public static void main(String...strings) {
		System.out.println("Enter 10 number pairs:");
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a > b) {
				System.out.println(a);
			}
			else {
				if(b > a) {
					System.out.println(b);
				}
				else {
					System.out.println("Numbers are equal!");
				}
			}
		}
		
		in.close();
	}
}
