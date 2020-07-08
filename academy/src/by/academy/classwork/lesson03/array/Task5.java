package by.academy.classwork.lesson03.array;

import java.util.Random;

public class Task5 {
public static void main(String...strings ) {
		
		Random rand = new Random();
		
		int arr_1[] = new int[5];
		int arr_2[] = new int[5];
		int sum_1 = 0, sum_2 = 0;
		int mid_1 = 0, mid_2 = 0;
		
		for(int i = 0; i < 5; i++) {
			arr_1[i] = rand.nextInt(5);
			sum_1 += arr_1[i];
			arr_2[i] = rand.nextInt(5);
			sum_2 += arr_2[i];
			System.out.printf("%d ", arr_1[i]);
		}		
		
		System.out.println();
		
		for(int elem:arr_2) {
			System.out.printf("%d ", elem);
		}
		
		mid_1 = sum_1/5;
		mid_2 = sum_2/5;
		
		if(mid_1 == mid_2) {
			System.out.println("\nЗначения равны!");
		}
		else {
			if(mid_1 > mid_2) {
			System.out.println("\nmid_1 > mid_2");
			}
			else {
			System.out.println("\nmid_1 < mid_2");
			}
		}
		
	}
}
