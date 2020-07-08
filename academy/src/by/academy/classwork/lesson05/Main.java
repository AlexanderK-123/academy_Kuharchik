package by.academy.classwork.lesson05;

import java.util.Scanner;

public class Main {
	//
	public static void main(String... strings) {
		User seller = new User("Ivan");
		User buyer = new User("Vlad");
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		
		Product[] products = { new Product() };
		
		Deal deal = new Deal(seller, buyer, products);
		 
	}
}
