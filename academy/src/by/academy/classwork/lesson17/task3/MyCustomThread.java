package by.academy.classwork.lesson17.task3;

import java.util.Random;

public class MyCustomThread extends Thread {

	private StringBuilder sb;
	private String name;

	public MyCustomThread() {
		// TODO Auto-generated constructor stub
		super();
	}

	public MyCustomThread(StringBuilder sb, String name) {
		// TODO Auto-generated constructor stub
		super();
		this.sb = sb;
		this.name = name;
	}

	@Override
	public void run() {
		

		// TODO Auto-generated method stub
		synchronized (sb) {
			for (int i = 0; i < 20; i++) {
				System.out.println(name + " : " + sb);
				char buf = sb.charAt(i);
				buf++;
				sb.append(buf);
			}
		}
	}

}
