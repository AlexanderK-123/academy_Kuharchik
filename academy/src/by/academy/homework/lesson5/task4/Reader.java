package by.academy.homework.lesson5.task4;

public class Reader extends Book{
	private String fio;
	private int id;
	private String faculty;
	private String dateBirth;
	private int phone;
	
	public Reader(){
		this.fio = null;
		this.id = 0;
		this.faculty = null;
		this.dateBirth = null;
		this.phone = 0;
	}
	
	public Reader(String fio, int id, String faculty, String dateBirth, int phone){
		this.fio = fio;
		this.id = id;
		this.faculty = faculty;
		this.dateBirth = dateBirth;
		this.phone = phone;
	}
	
	public String getFio() {
		return fio;
	}
	
	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getDateBirth() {
		return dateBirth;
	}
	
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void showReader() {
		System.out.printf("\nFIO: %s\nID: %s\nFaculty: %s\nDateBirth: %s\nPhone: %s", fio, id, faculty, dateBirth, phone);
	}
	
	public void takeBook(int q) {
		if(q == 1) {
			System.out.println(this.fio + " take " + q + " book");
		}else {
			System.out.println(this.fio + " take " + q + " books");
		}
	}
	
	public void takeBook(String...q) {
		System.out.println(this.fio + " take books:");
		for(String e : q) {
			System.out.printf("%s, ", e);
		}
	}
	
	public void takeBook(Book...books) {
		System.out.println(this.fio + " take books:");
		for(Book e : books) {
			System.out.printf("%s, ", e.nameBook);
		}
	}
	
	public void returnBook(int q) {
		if(q == 1) {
			System.out.println(this.fio + " return " + q + " book");
		}else {
			System.out.println(this.fio + " return " + q + " books");
		}
	}
	
	public void returnBook(String...q) {
		System.out.println(this.fio + " return books:");
		for(String e : q) {
			System.out.printf("%s, ", e);
		}
	}
	
	public void returnBook(Book...books) {
		System.out.println(this.fio + " return books:");
		for(Book e : books) {
			System.out.printf("%s, ", e.nameBook);
		}
	}
	
}
