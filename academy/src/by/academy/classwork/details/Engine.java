package by.academy.classwork.details;

public class Engine {
	private int power;
	private String company;
	
	public Engine() {
		this.power = 0;
		this.company = null;
	}
	
	public Engine(int power, String company) {
		this.power = power;
		this.company = company;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCapacity(String company) {
		this.company = company;
	}
}
