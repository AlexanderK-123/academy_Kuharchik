package by.academy.homework.lesson03;

import java.util.Scanner;

public class Task3 {
	public static void main(String...strings ) {
		
		System.out.println("Enter int nubmer from 1 to 10:");
		Scanner in = new Scanner(System.in);
		byte num = in.nextByte();
		while(num < 1 || num > 10) {
			System.out.println("Error!!! num can't be <1 or >10 Try arain:");
			num = in.nextByte();
		}
		in.close();
		
		for(byte i = 1; i <= 10; i++) {
			System.out.printf("\n%d * %-2d = %d", num, i, num*i);
		}
	}
}
