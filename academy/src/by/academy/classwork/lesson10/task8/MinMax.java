package by.academy.classwork.lesson10.task8;

public class MinMax<T extends Number> {
	private T[] array;
	private T t;

	public MinMax() {
		super();
	}

	public MinMax(T[] array) {
		super();
		this.array = array.clone();
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public double searchMin() {
		double min = array[0].doubleValue();
		for (int i = 0; i < array.length; i++) {
			if (array[i].doubleValue() < min) {
				min = array[i].doubleValue();
			}
		}
		return min;
	}

	public double searchMax() {
		double max = array[0].doubleValue();
		for (int i = 0; i < array.length; i++) {
			if (array[i].doubleValue() > max) {
				max = array[i].doubleValue();
			}
		}
		return max;
	}
}
