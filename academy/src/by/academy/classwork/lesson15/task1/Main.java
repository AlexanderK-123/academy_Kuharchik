package by.academy.classwork.lesson15.task1;

public class Main implements Printable {

	public static void main(String[] args) {
		String s = "string";
		//Printable p = s -> System.out.println(s);
		
		Main m = new Main();
		
		m.print(s);
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}

}
