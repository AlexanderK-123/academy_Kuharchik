package by.academy.classwork.vehicles;

public class Lorry extends Car{
	private int carrying;
	
	public Lorry() {
		super();
		this.carrying = 0;
	}
	
	public Lorry(int carrying) {
		super();
		this.carrying = carrying;
	}
	
	public int getCarrying() {
		return carrying;
	}
	
	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}
	
}
