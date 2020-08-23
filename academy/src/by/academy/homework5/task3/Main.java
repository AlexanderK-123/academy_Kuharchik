package by.academy.homework5.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> listOfUsers = new ArrayList<User>();

		listOfUsers.add(new User("Joe", "Barbaro", 27));
		listOfUsers.add(new User("Vito", "Scaletta", 27));
		listOfUsers.add(new User("Henry", "Tomasino", 29));
		listOfUsers.add(new User("Eddie", "Scarpa", 38));
		listOfUsers.add(new User("Luca", "Gurino", 36));
		listOfUsers.add(new User("Carlo", "Falcone", 39));
		listOfUsers.add(new User("Alberto", "Clemente", 49));
		listOfUsers.add(new User("Franco", "Vinci", 56));
		listOfUsers.add(new User("Leone", "Galante", 57));
		listOfUsers.add(new User("Stephen", "Coyne", 34));

		File users = new File("./academy/src/by/academy/homework5/task3/users/");
		if (!users.exists()) {
			users.mkdir();
		}

		FileOutputStream outputStream;
		String str;

		for (User u : listOfUsers) {
			str = u.getName() + "_" + u.getSurname() + ".txt";
			File file = new File(users, str);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			}
			try {
				outputStream = new FileOutputStream(file);
				try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
					objectOutputStream.writeObject(u);
				} catch (IOException e1) {
					System.err.println(e1.getMessage());
					e1.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				System.err.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}
