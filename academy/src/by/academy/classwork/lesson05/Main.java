package by.academy.classwork.lesson05;

import java.util.Scanner;

import by.academy.classwork.lesson9.Box;

public class Main {
	//
	public static void main(String... strings) {
		User seller = new User("Ivan");
		User buyer = new User("Vlad");
		Product[] products = new Product[2] ;
		Scanner in = new Scanner(System.in);
		String str;
		int p = 0;
		for(int i = 0; i < products.length; i++) {
			str = in.nextLine();
			p = in.nextInt();
			products[i] = new Product(str, p);
		}
		in.close();
		

		
		Box<Product> prodBox = new Box();
		prodBox.setItem(new Product());
		
		System.out.println(prodBox.getItem().getName());
		
		
		Deal deal = new Deal(seller, buyer, products);
		
		deal.showDeal();
		
		 
	}
}
