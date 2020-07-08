package by.academy.classwork.lesson03.array;

public class Task2 {
	public static void main(String...strings ) {
		
		int arr[] = new int[50];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*2+1;
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		for(int i = arr.length - 1;i >= 0; i--) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
