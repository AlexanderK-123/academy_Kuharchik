package by.academy.classwork.lesson10.task10;

public class BoxDemo<T> {
	private T[] array;
	private int counter = 0;

	@SuppressWarnings("unchecked")
	public BoxDemo() {
		super();
		array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public BoxDemo(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public BoxDemo(T[] array) {
		super();
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T getItem(int index) {
		if (index >= 0 && index < array.length) {
			return array[index];
		} else {
			System.out.println("ERROR!!!");
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public void add(T item) {
		if (array == null) {
			return;
		}
		if (counter == array.length) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		array[counter++] = item;
	}

	public void addToEnd(T item) {
		if (array == null) {
			return;
		}
		array[array.length - 1] = item;
		counter = array.length;
	}

	@SuppressWarnings("unchecked")
	public void addToIndex(T item, int index) {
		if (array == null) {
			return;
		}
		if (index > 0 && index < array.length) {
			array[index] = item;
		} else if (index > 0) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
			array[index] = item;
			counter = index;
		} else {
			System.out.println("ERROR!!!");
			return;
		}
	}
}
