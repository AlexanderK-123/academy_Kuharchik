package by.academy.homework2.Deal;

public class Milk extends Product {
	private final static int DISCOUNT = 15;

	public Milk() {
		super();
	}

	public Milk(String name, double price, int quantity) {
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
