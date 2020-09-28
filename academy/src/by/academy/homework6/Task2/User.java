package by.academy.homework6.Task2;

public class User extends Person {
	public String login;
	private String password;
	public String email;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User(String firstName, String lastName, int age, String dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
	}

	public User(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@SuppressWarnings("unused")
	private void printUserInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}
