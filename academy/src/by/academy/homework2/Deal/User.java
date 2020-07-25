package by.academy.homework2.Deal;

import by.academy.homework2.Task3;

public class User {

	private String name;
	private String dateOfBirth;
	private String phone;
	private String email;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User(String name, String dateOfBirth) {
		this(name);
		this.dateOfBirth = dateOfBirth;
	}

	public User(String name, String dateOfBirth, String phone, String email) {
		this(name, dateOfBirth);
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValidDateOfBirth(String s) {
		if (Task3.isValidDateString(s)) {
			return true;
		} else {
			return false;
		}
	}

}
