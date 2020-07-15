package by.academy.homework.lesson5.task8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = { new Dog("Bob", "Breed1"), new Cat("Tom", "Breed2"), new Horse("Mars", "Breed3")};
		
		for(int i = 0; i < animals.length; i++) {
			Vet.treatAnimal(animals[i]);
		}
	}

}
