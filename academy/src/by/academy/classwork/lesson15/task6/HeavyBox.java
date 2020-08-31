package by.academy.classwork.lesson15.task6;

public class HeavyBox {
	private int n;

	public HeavyBox() {
		super();
	}

	public HeavyBox(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + n;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeavyBox other = (HeavyBox) obj;
		if (n != other.n)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HeavyBox [n=" + n + "]";
	}

}
