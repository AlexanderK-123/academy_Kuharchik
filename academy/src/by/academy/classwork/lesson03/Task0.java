package by.academy.classwork.lesson03;

import java.util.Random;

public class Task0 {
	public static void main(String... strings ) {
		int arr[] = new int[10];
		int sum = 0;
		int mid = 0;
		Random rand = new Random();
		
		System.out.println("Array:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			sum+=arr[i];
			System.out.printf("%d ", arr[i]);
		}
		
		mid = sum/arr.length;
		
		System.out.printf("\nSum: %d; Mid: %d\n", sum, mid);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < mid) {
				System.out.printf("%d ", arr[i]);
			}
		}
		
		
		
	}
}
