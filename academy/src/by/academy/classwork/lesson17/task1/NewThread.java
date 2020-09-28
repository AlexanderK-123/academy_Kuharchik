package by.academy.classwork.lesson17.task1;

public class NewThread extends Thread {

	public NewThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ") a");
		}
	}

}
