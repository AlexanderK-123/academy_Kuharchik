package by.academy.classwork.lesson6.task11;

public abstract class Shape {
	protected String color;
	
	public Shape() {
		super();
	}
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printShape() {
		System.out.println("Shape:\n Shape color: " + color);
	}
	
	abstract void draw();
	
	public boolean equals(Object obj) {
		if (obj == this) {
	        return true;
	    }
	    
		if (obj == null || obj.getClass() != this.getClass()) {
	        return false;
	    }
		
		Shape guest = (Shape) obj;
		if(color == guest.color) {
			return true;
		}else {
			return false;
		}
	}
}
