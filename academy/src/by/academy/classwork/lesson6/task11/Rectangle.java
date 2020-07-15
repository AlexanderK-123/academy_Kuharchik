package by.academy.classwork.lesson6.task11;

public class Rectangle extends Shape{

	private double x1, x2, y1, y2;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double x1, double y1, double x2,double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangle(double x1, double y1, double x2,double y2, String color) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}
	
	public double getX1() {
		return x1;
	}
	
	public void setX1(double x1) {
		this.x1 = x1;
	}
	
	public double getY1() {
		return y1;
	}
	
	public void setY1(double y1) {
		this.y1 = y1;
	}
	
	public double getX2() {
		return x2;
	}
	
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	public double getY2() {
		return y2;
	}
	
	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw rectangle");	
	}
	
	public void printShape() {
		System.out.printf("\nRectangle:\n Rectangle x1: %f\n Rectangle y1: %f\n Rectangle x2: %f\n Rectangle y2: %f\n Rectangle color: %s\n", x1, y1, x2, y2, color);
	}
	
	public boolean equals(Object obj) {
		if (obj == this) {
	        return true;
	    }
		
		if (obj == null || obj.getClass() != this.getClass()) {
	        return false;
	    }
		
		Rectangle guest = (Rectangle) obj;
		if(x1 == guest.x1) {
			if(x2 == guest.x2) {
				if(y1 == guest.y1) {
					if(y2 == guest.y2) {
						if(color == guest.color) {
							return true;
						}else {
							return false;
						}
					}else {
						return false;
					}
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
