package by.academy.homework.lesson5.task8;

public class Cat extends Animal{
	private String name;
	private String breed;
	
	public Cat(){
		super();
		this.name = null;
		this.breed = null;
	}
	
	public Cat(String name, String breed){
		super();
		this.food = "Fish";
		this.location = "Flat";
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
