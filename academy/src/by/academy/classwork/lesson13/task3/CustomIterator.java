package by.academy.classwork.lesson13.task3;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

	private T[] array;
	private Integer counter = 0;

	public CustomIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return array != null && array.length > counter && array[counter] != null;
	}

	@Override
	public T next() {
		return array[counter++];
	}
}
