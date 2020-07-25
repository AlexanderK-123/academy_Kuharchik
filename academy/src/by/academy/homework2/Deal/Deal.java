package by.academy.homework2.Deal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;
	private Date deadline;

	public Deal() {
		super();
		init();
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		init();
	}

	private void init() {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 10);
		this.deadline = c.getTime();
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProduct() {
		return products;
	}

	public void setProduct(Product[] products) {
		this.products = products;
	}

	private double countFinalPrice() {
		double finalPrice = 0;
		for (int i = 0; i < products.length; i++) {
			finalPrice += products[i].getPrice() * products[i].getQuantity();
		}
		return finalPrice;
	}

	public void showDeal() {
		System.out.printf("Seller: %-10s\nBirth: %-10s\nPhone: %-11s\nEmail: %-20s\n", seller.getName(),
				seller.getDateOfBirth(), seller.getPhone(), seller.getEmail());
		System.out.println("------------------------------------------");
		System.out.printf("Buyer: %-10s\nBirth: %-10s\nPhone: %-11s\nEmail: %-20s\n", buyer.getName(),
				buyer.getDateOfBirth(), buyer.getPhone(), buyer.getEmail());
		System.out.println("------------------------------------------");
		System.out.printf("\n%15s : %10s : %10s\n", "Product name", "Price", "Quantity");
		for (int i = 0; i < products.length; i++) {
			products[i].showProduct();
		}
		System.out.println("------------------------------------------");
		System.out.println("Final price: " + countFinalPrice());
	}

	public static void menu(Deal d) {
		System.out.println("1 - add product;\n2 - delete product;\n3 - show deal.");
		Scanner in = new Scanner(System.in);
		int sw = in.nextInt();
		switch (sw) {
		case 1:
			// products();
			break;
		case 2:
			System.out.println("Enter name of product:");
			String s = in.nextLine();
			break;
		case 3:
			d.showDeal();
			break;
		}
		in.close();
	}

}
