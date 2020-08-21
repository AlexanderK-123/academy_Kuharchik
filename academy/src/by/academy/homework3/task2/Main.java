package by.academy.homework3.task2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo<Integer> integer1 = new BoxDemo<>();

		System.out.println(Arrays.toString(integer1.getArray()));
		integer1.add(666);
		System.out.println(Arrays.toString(integer1.getArray()));
		integer1.addToEnd(90);
		System.out.println(Arrays.toString(integer1.getArray()));
		integer1.addToIndex(33, 20);
		System.out.println(Arrays.toString(integer1.getArray()));
		integer1.addToIndex(111, 1);
		integer1.addToIndex(222, 2);
		integer1.addToIndex(55, 3);
		integer1.addToIndex(88, 4);
		integer1.addToIndex(500, 19);
		System.out.println(Arrays.toString(integer1.getArray()));
		System.out.println("Item 20: " + integer1.getItem(20));
		System.out.println("Item last index: " + integer1.getLastIndex());
		System.out.println("Item first: " + integer1.getFirst());
		System.out.println("Item last: " + integer1.getLast());
		integer1.remByIndex(3);
		integer1.remByItem(90);
		System.out.println(Arrays.toString(integer1.getArray()));
	}
}
