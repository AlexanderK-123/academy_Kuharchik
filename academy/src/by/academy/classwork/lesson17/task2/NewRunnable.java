package by.academy.classwork.lesson17.task2;

public class NewRunnable implements Runnable {

	private String name;

	public NewRunnable(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0 && i != 0) {
				System.out.println(i + " " + name);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			i % 10 == 0 ? System.out.println(i);
		}

	}

}
