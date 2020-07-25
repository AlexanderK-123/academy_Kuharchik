package by.academy.homework2.Deal;

public class Phone extends Product {
	private final static int DISCOUNT = 10;

	public Phone() {
		super();
	}

	public Phone(String name, double price, int quantity) {
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
