package by.academy.homework2.Deal;

import java.util.Scanner;

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

	public Product addProductMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Add product menu:");
		System.out.println("Enter name of product:");
		String name = in.nextLine();
		System.out.println("Enter price of product:");
		double price = in.nextDouble();
		System.out.println("Enter quantity of product:");
		int quantity = in.nextInt();
		in.close();
		return new Product(name, price, quantity);
	}
}
