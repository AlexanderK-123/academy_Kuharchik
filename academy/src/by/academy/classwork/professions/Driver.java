package by.academy.classwork.professions;

public class Driver {
	protected String fio;
	protected int exp;
	
	public Driver() {
		this.fio = null;
		this.exp = 0;
	}
	
	public Driver(String fio, int exp) {
		this.fio = fio;
		this.exp = exp;
	}
	
	public String getFio() {
		return fio;
	}
	
	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
}
