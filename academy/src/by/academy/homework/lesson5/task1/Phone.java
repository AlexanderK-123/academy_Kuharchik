package by.academy.homework.lesson5.task1;

import java.io.Serializable;

public class Phone implements Serializable {
	private int number;
	private String model;
	private int weight;
	
	public Phone()  {
		super();
		this.number = 0;
		this.model = null;
		this.weight = 0;
	}
	
	public Phone(int number, String model) {
		super();
		this.number = number;
		this.model = model;
	}
	
	public Phone(int number, String model, int weight) {
		this(number, model);
		this.weight = weight;
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void showPhone() {
		System.out.printf("\nNumber: %d\nModel %s\nWeight %d\n", number, model, weight);
	}
	
	public void receiveCall(String name){
		System.out.printf("\nЗвонит {%s}\n", name);
	}
	
	public void receiveCall(String name, int number){
		System.out.printf("\nЗвонит {%s}, Номер {%d}\n", name, number);
	}
	
	public void sendMessage(int...number){
		for(int e : number) {
			System.out.println(e);
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
	        return true;
	    }
	    
		if (obj == null || obj.getClass() != this.getClass()) {
	        return false;
	    }
	    
		 Phone guest = (Phone) obj;
		    return number == guest.number;
//		        && (model == guest.model
//		            || (model != null && model.equals(guest.getModel()))) && (weight == guest.weight
//		            || (weight != 0 && weight.equals(guest.getWeight())
//		            ));
		}
}
