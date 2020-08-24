package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.lesson9.Box;
import by.academy.classwork.professions.Driver;

public class Main {

	public static void main(String[] args) {
		Driver d1 = new Driver("Schumacher", 999);
		Engine en1 = new Engine(1000, "Germany");
		Car car1 = new Car("Porsche", "Sport", 1200, d1, en1);
		car1.printInfo();
		
		Box<Car> boxCar = new Box<Car>(car1);
		
		boxCar.getItem().printInfo();
		
		

	}

}
