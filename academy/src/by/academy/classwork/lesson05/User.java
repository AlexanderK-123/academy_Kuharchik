package by.academy.classwork.lesson05;

public class User {
	//N
	private String name;
	
	public User(){
		super();
		
		this.name = "Noname";
	}
	
	public User(String name) {
		super();
	
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
