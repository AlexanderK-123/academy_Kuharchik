package by.academy.classwork.lesson03;

public class Task1 {
	public static void main(String...strings ) {
		int arr[] = {2,4,6,8,10,12,14,16,18,20};
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		for(int elem:arr) {
			System.out.println(elem);
		}
	}
}
