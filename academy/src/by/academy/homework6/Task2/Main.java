package by.academy.homework6.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		User user = new User("Peter", "Parker", 25);
		user = new User("log", "12345", "post@mail.com");

		Person person = new Person();

		Class<Person> personClass = Person.class;
		Class<User> userClass = User.class;

		System.out.println("Person:\n    getFields():");

		Field[] personFields = personClass.getFields();
		for (Field field : personFields) {
			Class<?> fieldType = field.getType();
			System.out.println("        Имя: " + field.getName());
			System.out.println("        Тип: " + fieldType.getName());
		}

		String[] fieldNamesOfPerson = { "firstName", "lastName", "age", "dateOfBirth", "flag" };

		System.out.println("---------------------\n    getField(Name):");

		for (String e : fieldNamesOfPerson) {
			try {
				System.out.println("        Имя: " + personClass.getField(e).getName());
				System.out.println("        Тип: " + personClass.getField(e).getType());
			} catch (NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getMethods():");

		Method[] personMethods = personClass.getMethods();
		for (Method method : personMethods) {
			Class<?> methodType = method.getReturnType();
			System.out.println("        Имя: " + method.getName());
			System.out.println("        Тип: " + methodType.getName());
		}

		String[] methodNamesOfPerson = { "getFirstName", "setFirstName", "getLastName", "setLastName", "getAge",
				"setAge", "getDateOfBirth", "setDateOfBirth" };

		System.out.println("---------------------\n    getMethod(Name):");

		for (String e : methodNamesOfPerson) {
			try {
				System.out.println("        Имя: " + personClass.getMethod(e).getName());
				System.out.println("        Тип: " + personClass.getMethod(e).getReturnType());
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getDeclaredFields():");

		Field[] personDeclaredFields = personClass.getDeclaredFields();
		for (Field field : personDeclaredFields) {
			Class<?> fieldType = field.getType();
			System.out.println("        Имя: " + field.getName());
			System.out.println("        Тип: " + fieldType.getName());
		}

		System.out.println("---------------------\n    getDeclaredField(Name):");

		for (String e : fieldNamesOfPerson) {
			try {
				System.out.println("        Имя: " + personClass.getDeclaredField(e).getName());
				System.out.println("        Тип: " + personClass.getDeclaredField(e).getType());
			} catch (NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getDeclaredMethods():");

		Method[] personDeclaredMethods = personClass.getDeclaredMethods();
		for (Method method : personDeclaredMethods) {
			Class<?> methodType = method.getReturnType();
			System.out.println("        Имя: " + method.getName());
			System.out.println("        Тип: " + methodType.getName());
		}

		System.out.println("---------------------\n    getDeclaredMethod(Name):");

		for (String e : methodNamesOfPerson) {
			try {
				Method method = person.getClass().getDeclaredMethod(e);
				method.setAccessible(true);
				System.out.println("        Имя: " + method.getName());
				System.out.println("        Тип: " + method.getReturnType());
			} catch (NoSuchMethodException | SecurityException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

		System.out.println("---------------------\nUser:\n    getFields():");

		Field[] userFields = userClass.getFields();
		for (Field field : userFields) {
			Class<?> fieldType = field.getType();
			System.out.println("        Имя: " + field.getName());
			System.out.println("        Тип: " + fieldType.getName());
		}

		String[] fieldNamesOfUser = { "login", "password", "email", "count" };

		System.out.println("---------------------\n    getField(Name):");

		for (String e : fieldNamesOfUser) {
			try {
				System.out.println("        Имя: " + userClass.getField(e).getName());
				System.out.println("        Тип: " + userClass.getField(e).getType());
			} catch (NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getMethods():");

		Method[] userMethods = userClass.getMethods();
		for (Method method : userMethods) {
			Class<?> methodType = method.getReturnType();
			System.out.println("        Имя: " + method.getName());
			System.out.println("        Тип: " + methodType.getName());
		}

		String[] methodNamesOfUser = { "getLogin", "setLogin", "getPassword", "setPassword", "getEmail", "setEmail",
				"printUserInfo" };

		System.out.println("---------------------\n    getMethod(Name):");

		for (String e : methodNamesOfUser) {
			try {
				System.out.println("        Имя: " + userClass.getMethod(e).getName());
				System.out.println("        Тип: " + userClass.getMethod(e).getReturnType());
			} catch (NoSuchMethodException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getDeclaredFields():");

		Field[] userDeclaredFields = userClass.getDeclaredFields();
		for (Field field : userDeclaredFields) {
			Class<?> fieldType = field.getType();
			System.out.println("        Имя: " + field.getName());
			System.out.println("        Тип: " + fieldType.getName());
		}

		System.out.println("---------------------\n    getDeclaredField(Name):");

		for (String e : fieldNamesOfUser) {
			try {
				System.out.println("        Имя: " + userClass.getDeclaredField(e).getName());
				System.out.println("        Тип: " + userClass.getDeclaredField(e).getType());
			} catch (NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("---------------------\n    getDeclaredMethods():");

		Method[] userDeclaredMethods = userClass.getDeclaredMethods();
		for (Method method : userDeclaredMethods) {
			Class<?> methodType = method.getReturnType();
			System.out.println("        Имя: " + method.getName());
			System.out.println("        Тип: " + methodType.getName());
		}

		System.out.println("---------------------\n    getDeclaredMethod(Name):");

		for (String e : methodNamesOfUser) {
			try {
				Method method = user.getClass().getDeclaredMethod(e);
				method.setAccessible(true);
				System.out.println("        Имя: " + method.getName());
				System.out.println("        Тип: " + method.getReturnType());
			} catch (NoSuchMethodException | SecurityException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

		System.out.println("---------------------\n    toString через invoke:\n");

		try {
			Method method = userClass.getMethod("toString");
			System.out.println(method.invoke(user) + "\n");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("---------------------\n    Сетаем значения:\n");

		try {
			Field field = person.getClass().getDeclaredField("firstName");
			field.setAccessible(true);
			field.set(user, "Bob");
			field = person.getClass().getDeclaredField("lastName");
			field.setAccessible(true);
			field.set(user, "Marley");
			field = person.getClass().getDeclaredField("age");
			field.setAccessible(true);
			field.set(user, 20);
			field = person.getClass().getDeclaredField("dateOfBirth");
			field.setAccessible(true);
			field.set(user, "01/01/2000");

			field = userClass.getDeclaredField("login");
			field.setAccessible(true);
			field.set(user, "Weed");
			field = userClass.getDeclaredField("password");
			field.setAccessible(true);
			field.set(user, "qwerty");
			field = userClass.getDeclaredField("email");
			field.setAccessible(true);
			field.set(user, "mailOfMails@mail.ru");
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		for (Field field : Arrays.asList(personClass.getDeclaredFields())) {
			try {
				System.out.println(field.get(user));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		for (Field field : Arrays.asList(userClass.getDeclaredFields())) {
			try {
				field.setAccessible(true);
				System.out.println(field.get(user));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

}
