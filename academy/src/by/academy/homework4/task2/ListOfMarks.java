package by.academy.homework4.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfMarks {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(((int) (Math.random() * 10) + 1));
			System.out.print(list.get(i) + " ");
		}

		Iterator<Integer> iterator = list.iterator();

		Integer max = 0;
		int buf = 0;
		while (iterator.hasNext()) {
			buf = iterator.next();
			if (max < buf) {
				max = buf;
			}
		}

		System.out.println("\n" + max);

	}

}
