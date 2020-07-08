package by.academy.classwork.lesson05;

public class Main {
	//new
	public static void main(String... strings) {
		User seller = new User();
		User buyer = new User();
		Product[] products = { new Product() };
		
		Deal deal = new Deal(seller, buyer, products);
		
		Deal deal1 = new Deal(1);
		Deal deal2 = new Deal(new Integer(1)); 
		Deal deal3 = new Deal(Integer.MAX_VALUE); 
	}
}
