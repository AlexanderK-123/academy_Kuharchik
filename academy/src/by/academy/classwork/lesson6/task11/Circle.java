package by.academy.classwork.lesson6.task11;

public class Circle extends Shape{
	
	private double x, y, r;
	
	public Circle() {
		super();
	}
	
	public Circle(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circle(double x, double y, double r, String color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public void printShape() {
		System.out.printf("\nCircle:\n Circle x: %f\n Circle y: %f\n Circle r: %f\n Circle color: %s\n", x, y, r, color);
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw circle");
	}
	
	public boolean equals(Object obj) {
	if (obj == this) {
        return true;
    }
		
	if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }
		
	Circle guest = (Circle) obj;
	if(x == guest.x) {
		if(y == guest.y) {
			if(r == guest.r) {
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
	}
}
