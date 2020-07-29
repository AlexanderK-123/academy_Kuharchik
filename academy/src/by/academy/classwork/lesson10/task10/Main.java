package by.academy.classwork.lesson10.task10;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo<Integer> integer1 = new BoxDemo<>(10);
		System.out.println(Arrays.toString(integer1.getArray()));
		System.out.println(integer1.getItem(5));
		integer1.add(666);
		System.out.println(Arrays.toString(integer1.getArray()));
		System.out.println(integer1.getItem(0));
		integer1.addToEnd(90);
		System.out.println(Arrays.toString(integer1.getArray()));
		integer1.addToIndex(33, 20);
		System.out.println(Arrays.toString(integer1.getArray()));
	}

}
