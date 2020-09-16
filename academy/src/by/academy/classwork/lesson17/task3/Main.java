package by.academy.classwork.lesson17.task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();
		builder.append('a');

		Thread t1 = new MyCustomThread(builder, "T1");
		Thread t2 = new MyCustomThread(builder, "T2");
		Thread t3 = new MyCustomThread(builder, "T3");

//		System.out.println(builder);
//
//		char buf = builder.charAt(0);
//		buf++;
//		builder.deleteCharAt(0);
//		builder.append(buf);
//
//		System.out.println(builder);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
