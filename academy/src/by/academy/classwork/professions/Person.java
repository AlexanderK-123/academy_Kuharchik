package by.academy.classwork.professions;

public class Person extends Driver{
	private final int age;
	
	public Person() {
		super();
		this.age = 0;
	}
	
	public Person(int age) {
		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void fullName() {
		System.out.println(fio);
	}
}
