package by.academy.classwork.lesson04;

public class Product {
	private double price;
	private int quantity;
	private String name;

	Product() {
		this.price = 0;
		this.quantity = 0;
		this.name = null;
	}

	public Product(double price, int quantity, String name) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDiscount(int discount) {
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price * quantity / 100 * (100 - getDiscount());
	}

	public int getQuantity() {
		return quantity;
	}

	public int getDiscount() {
		return 10;
	}

	public String getName() {
		return name;
	}

}
