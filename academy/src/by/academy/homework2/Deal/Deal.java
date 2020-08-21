package by.academy.homework2.Deal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;

public class Deal {

	private User seller;
	private User buyer;
	private ArrayList<Product> products;
	private Date deadline;

	public Deal() {
		super();
		init();
	}

	public Deal(User seller, User buyer, ArrayList<Product> products) {
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

	public ArrayList<Product> getProduct() {
		return products;
	}

	public void setProduct(ArrayList<Product> products) {
		this.products = products;
	}

	private double countFinalPrice() {
		Iterator<Product> iterator = products.iterator();
		double finalPrice = 0;
		while (iterator.hasNext()) {
			finalPrice += iterator.next().getPrice() * iterator.next().getQuantity();
		}
		return finalPrice;
	}

	public void showDeal() {
		Iterator<Product> iterator = products.iterator();
		System.out.printf("Seller: %-10s\nBirth: %-10s\nPhone: %-11s\nEmail: %-20s\n", seller.getName(),
				seller.getDateOfBirth(), seller.getPhone(), seller.getEmail());
		System.out.println("------------------------------------------");
		System.out.printf("Buyer: %-10s\nBirth: %-10s\nPhone: %-11s\nEmail: %-20s\n", buyer.getName(),
				buyer.getDateOfBirth(), buyer.getPhone(), buyer.getEmail());
		System.out.println("------------------------------------------");
		System.out.printf("\n%15s : %10s : %10s\n", "Product name", "Price", "Quantity");
		while (iterator.hasNext()) {
			iterator.next().showProduct();
		}
		System.out.println("------------------------------------------");
		System.out.println("Final price: " + countFinalPrice());
	}

	public void menu() {
		System.out.println("1 - add product;\n2 - delete product;\n3 - show deal.");
		Scanner in = new Scanner(System.in);
		int sw = in.nextInt();
		switch (sw) {
		case 1:
			Product product = new Product();
			products.add(product.addProductMenu());
			this.showDeal();
			break;
		case 2:
			System.out.println("Enter name of product:");
			String s = in.next();
			in.close();
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i).getName() == s) {
					products.remove(i);
				}
			}
			this.showDeal();
			break;
		case 3:
			this.showDeal();
			break;
		default:
			break;
		}
	}
}
