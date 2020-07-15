package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Car {
	protected String model;
	protected String klass;
	protected int weight;
	protected Driver driver;
	protected Engine engine;
	
	public Car() {
		this.model = null;
		this.klass = null;
		this.weight = 0;
		this.driver = null;
		this.engine = null;
	}
	
	public Car(String model,String klass, int weight, Driver driver, Engine engine) {
		this.model = model;
		this.klass = klass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getKlass() {
		return klass;
	}
	
	public void setKlass(String klass) {
		this.klass = klass;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		System.out.println("GO");
	}
	
	public void stop() {
		System.out.println("STOP");
	}
	
	public void turnRight() {
		System.out.println("Turn right");
	}
	
	public void turnLeft() {
		System.out.println("Turn left");
	}
	
	public void printInfo(){
		System.out.printf("\nModel: %s\nKlass: %s\nWeight: %d\nDriver:\n FIO: %s\n Experience: %d\nEngine:\n Power: %d\n Company: %s\n", model, klass, weight, driver.getFio(), driver.getExp(), engine.getPower(), engine.getCompany());
	}
}
