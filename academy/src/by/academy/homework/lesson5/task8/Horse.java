package by.academy.homework.lesson5.task8;

public class Horse extends Animal{
	private String name;
	private String breed;
	
	public Horse(){
		super();
		this.name = null;
		this.breed = null;
	}
	
	public Horse(String name, String breed){
		super();
		this.food = "Oat";
		this.location = "Horsestable";
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
