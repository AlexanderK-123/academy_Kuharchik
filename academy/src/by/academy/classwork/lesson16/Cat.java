package by.academy.classwork.lesson16;

public class Cat {

	public String name;
	protected int age;
	private String color;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Cat(String name, int age, String color) {
		this(name, age);
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected void move() {
		System.out.println("Cat move");
	}

	protected void voice() {
		System.out.println("Meau");
	}

	protected void eat() {
		System.out.println("Cat eat");
	}

	protected String look() {
		return "Cat look";
	}

	protected String lookFor(String s) {
		return this.look() + " for " + s;
	}

	public void play(String s) {
		this.playWith(s);
	}

	private void playWith(String s) {
		System.out.println("Cat plays with " + s);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

}
