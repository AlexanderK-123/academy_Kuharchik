package by.academy.homework2.Deal;

import java.util.Scanner;

import by.academy.homework2.task5.BelarusPhoneValidator;
import by.academy.homework2.task5.EmailValidator;
import by.academy.homework2.task5.Validator;

public class Main {

	User seller = new User();
	User buyer = new User();
	static Validator emailValidator = new EmailValidator();
	static Validator belPhoneValidator = new BelarusPhoneValidator();

	public static void main(String... strings) {

		User seller = new User("Ivan", "01-01-2000");
		User buyer = new User("Vlad", "03/04/1990");
		Product[] products = { new Product("PC", 2000, 5), new Banana("Yellow", 100, 10), new Phone("Sony", 1000, 5),
				new Milk("White", 200, 10) };
		Deal deal = new Deal(seller, buyer, products);
		deal.menu();

	}

	public static void userLogIn(User seller, User buyer) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter seller's name:");
		seller.setName(in.nextLine());
		String s = "";
		while (!seller.isValidDateOfBirth(s)) {
			System.out.println("Enter seller's date of birth in next format:  <dd/MM/yyyy> or <dd-MM-yyyy>");
			s = in.nextLine();
			seller.setDateOfBirth(s);
		}
		while (!belPhoneValidator.validate(s)) {
			System.out.println("Enter seller's phone in next format:  <+375.......>");
			s = in.nextLine();
			seller.setPhone(s);
		}
		while (!emailValidator.validate(s)) {
			System.out.println("Enter seller's email:  ");
			s = in.nextLine();
			seller.setEmail(s);
		}
		System.out.println("Enter buyer's name:");
		buyer.setName(in.nextLine());
		String b = "";
		while (!buyer.isValidDateOfBirth(b)) {
			System.out.println("Enter buyer's date of birth in next format:  <dd/MM/yyyy> or <dd-MM-yyyy>");
			b = in.nextLine();
			buyer.setDateOfBirth(b);
		}
		while (!belPhoneValidator.validate(b)) {
			System.out.println("Enter buyer's phone in next format:  <+375.......>");
			b = in.nextLine();
			buyer.setPhone(b);
		}
		while (!emailValidator.validate(b)) {
			System.out.println("Enter buyer's email:  ");
			b = in.nextLine();
			buyer.setEmail(b);
		}
		in.close();
	}

	public static Product[] products() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter quantity of products:");
		Product[] products = new Product[in.nextInt()];
		for (int i = 0; i < products.length; i++) {
			System.out.println("\n " + i + " product:\nEnter name of product:");
			products[i].setName(in.nextLine());
			System.out.println("Enter price of product:");
			products[i].setPrice(in.nextDouble());
			System.out.println("Enter quantity of product:");
			products[i].setQuantity(in.nextInt());
		}
		in.close();
		return products;
	}
}
