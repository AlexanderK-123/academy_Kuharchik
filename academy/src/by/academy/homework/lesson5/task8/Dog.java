package by.academy.homework.lesson5.task8;

public class Dog extends Animal{
	private String name;
	private String breed;
	
	public Dog(){
		super();
		this.name = null;
		this.breed = null;
	}
	
	public Dog(String name, String breed){
		super();
		this.food = "Meat";
		this.location = "Doghouse";
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
