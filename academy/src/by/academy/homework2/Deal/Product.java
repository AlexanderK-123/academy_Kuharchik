package by.academy.homework2.Deal;

@ProducerInfo(company = "", name = "")
public class Product {

	protected String name;
	protected double price;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	@ProducerInfo(company = "", name = "")
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void showProduct() {
		System.out.printf("%15s : %10.2f : %10d\n", name, price, quantity);
	}
}
