package by.academy.classwork.lesson05;

@ProducerInfo(company = "", name = "")
public class Product {

	private String name;
	private double price;

	public Product() {
		super();
		this.name = "Noname";
		this.price = 0;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@ProducerInfo(company = "", name = "")
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
