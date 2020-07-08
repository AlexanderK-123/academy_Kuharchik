package by.academy.classwork.lesson05;

public class Deal {
	
	//
	private User seller;
	private User buyer;
	private Product[] products;
	
	public Deal() {
		super();
	}
	
	public Deal(int i) {
		super();
	}
	
	public Deal(User seller,  User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
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
	
	
	
}
