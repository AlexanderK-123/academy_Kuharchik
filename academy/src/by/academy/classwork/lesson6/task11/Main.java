package by.academy.classwork.lesson6.task11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {new Rectangle(2, 1, 3, 3, "blue"), new Circle(5, 5, 2), new Rectangle(2, 1, 3, 3, "blue"), new Circle(5, 5, 2)};
		for(Shape e : shapes) {
			e.draw();
		}
		
		Circle c = new Circle(1,2,3);
		Rectangle r = new Rectangle(1,2,3,34,"red");
		r.draw();
		c.draw();
		
		c.printShape();
		r.printShape();
		System.out.println(shapes[0].equals(shapes[2]));
		System.out.println(shapes[3].equals(shapes[1]));
		
		
		for(Shape m : shapes) {
			m.printShape();
		}
	}

}


