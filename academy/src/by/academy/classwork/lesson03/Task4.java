package by.academy.classwork.lesson03;

import java.util.Random;

public class Task4 {
	public static void main(String...strings ) {
		
		Random rand = new Random();
		
		int arr[] = new int[8];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10)+1;
			System.out.printf("%d ", arr[i]);
		}		
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(i%2!=0) {
				arr[i] = 0;
			}
			System.out.printf("%d ", arr[i]);
		}
		
	}
}
