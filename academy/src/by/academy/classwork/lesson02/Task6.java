package by.academy.classwork.lesson02;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("������� 2 �����: ");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		in.close();
		
		if(a > b) {
			System.out.println(a + " - �������; " + b + " - �������!");
		}
		else if(a < b) {
			System.out.println(a + " - �������; " + b + " - �������!");
		}
		else {
			System.out.println("����� �����!");
		}
		
		System.out.println((a+b)/2 + " - ������� ��������������!");
	}
}
