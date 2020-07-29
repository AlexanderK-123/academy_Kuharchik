package by.academy.classwork.lesson11.task12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10_000_000;
		int maxR = 10;
		int minR = 1;
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<Integer>();

		long startMS = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			aList.add((int) (Math.random() * (maxR) + minR));
		}
		long endMS = System.currentTimeMillis();

		long startMS2 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			lList.add((int) (Math.random() * (maxR) + minR));
		}
		long endMS2 = System.currentTimeMillis();

//		System.out.println("ArrayList " + (endMS - startMS) + "ms " + aList);
//		System.out.println("LinkedList " + (endMS2 - startMS2) + "ms " + lList);
		
		System.out.println("ArrayList " + (endMS - startMS) + "ms");
		System.out.println("LinkedList " + (endMS2 - startMS2) + "ms");
	}

}
