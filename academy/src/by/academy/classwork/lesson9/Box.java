package by.academy.classwork.lesson9;

public class Box<T> {
	private T item;

	public Box() {
		super();
	}

	public Box(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
