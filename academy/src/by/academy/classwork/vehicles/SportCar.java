package by.academy.classwork.vehicles;

public class SportCar extends Car{
	private int maxSpeed;
	
	public SportCar() {
		super();
		this.maxSpeed = 0;
	}
	
	public SportCar(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void getMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
