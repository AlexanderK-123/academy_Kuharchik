package by.academy.classwork.lesson03;

import java.util.Random;

public class Task3 {
	public static void main(String...strings ) {
		
		Random rand = new Random();
		
		int arr[] = new int[15];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(9);
			System.out.printf("%d ", arr[i]);
		}
		
		for(int elem:arr) {
			if(elem%2==0 && elem != 0) {
				count++;
			}
		}
		
		System.out.println("\nCount: " + count);
	}
}
