package by.academy.classwork.lesson10.task1;

public class User {
	private String login;
	private String password;

	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public class Query {
		public Query() {
			super();
		}

		public void printToLog() {
			System.out.println("User:\nLogin: " + login + "\nPassword: " + password + "\n------------------");
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();
	}

}
