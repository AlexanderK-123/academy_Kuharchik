package by.academy.homework.lesson5.task8;

public class Animal {
	protected String food;
	protected String location;
	
	public Animal() {
		this.food = null;
		this.location = null;
	}
	
	public Animal(String food, String location) {
		this.food = food;
		this.location = location;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void makeNoise() {
		System.out.println("NOIZE!!!");	
	}
	
	public void eat() {
		System.out.println("Animal eat");
	}
	
	public void sleep() {
		System.out.println("Animal sleep");
	}
}
