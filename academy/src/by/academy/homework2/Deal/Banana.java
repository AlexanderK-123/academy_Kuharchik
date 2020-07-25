package by.academy.homework2.Deal;

public class Banana extends Product {
	private final static int DISCOUNT = 20;

	public Banana() {
		super();
	}

	public Banana(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = calculateDiscount(price);
		this.quantity = quantity;
	}

	public int getDiscount() {
		return DISCOUNT;
	}

	public double calculateDiscount(double price) {
		price -= price * DISCOUNT / 100;
		return price;
	}
}
