package by.academy.classwork.lesson10.task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Alex-123", "PassWORD");
		user.createQuery();
		User.Query q = user.new Query();
		q.printToLog();
		User.Query q2 = new User().new Query();
		q2.printToLog();
	}

}
