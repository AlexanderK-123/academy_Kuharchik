package by.academy.homework.lesson5.task1;

public class Main {
	public static void main(String...strings) {
		Phone p1 = new Phone();
		Phone p2 = new Phone(1234567, "Nokia");
		Phone p3 = new Phone(7654321, "Blackberry", 200);
		
		p1.showPhone();
		p2.showPhone();
		p3.showPhone();
		
		p1.receiveCall("Вася");
		p2.receiveCall("Петя");
		p3.receiveCall("Глеб");
		
		p1.getNumber();
		p2.getNumber();
		p3.getNumber();
		
		p1.receiveCall("Гена", 5553535);
		p2.receiveCall("Артур", 1312151);
		p3.receiveCall("Слава", 7777777);
		
		p1.sendMessage(1111111, 2222222, 3333333);
	}
}
