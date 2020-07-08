package by.academy.classwork.lesson05;

public class Product {
	//
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
