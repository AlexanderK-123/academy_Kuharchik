package by.academy.classwork.lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task1 {
	public static void main(String... strings) {
		Integer[] array = { 0, 1, 9, 7, 4, 5, 2, 3, 2, 4, 8, 7, -1, 28, 10, 5, 5, -20 };
		printCollection(mySet(array));

	}

	public static <T> Set<T> mySet(T[] collection) {
		Set<T> set = new HashSet<T>(List.of(collection));
		return set;
	}

	public static <T> void printCollection(Set<T> set) {
		Iterator<T> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
