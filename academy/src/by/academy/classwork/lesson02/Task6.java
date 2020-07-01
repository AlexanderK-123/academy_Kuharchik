package by.academy.classwork.lesson02;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("¬ведите 2 числа: ");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		in.close();
		
		if(a > b) {
			System.out.println(a + " - большее; " + b + " - меньшее!");
		}
		else if(a < b) {
			System.out.println(a + " - меньшее; " + b + " - большее!");
		}
		else {
			System.out.println("„исла равны!");
		}
		
		System.out.println((a+b)/2 + " - среднее арифметическое!");
	}
}
