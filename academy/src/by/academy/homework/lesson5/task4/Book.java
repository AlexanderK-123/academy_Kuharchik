package by.academy.homework.lesson5.task4;

public class Book {
	protected String nameBook;
	protected String author;
	
	public Book() {
		this.nameBook = null;
		this.author = null;
	}
	
	public Book(String nameBook, String author) {
		this.nameBook = nameBook;
		this.author = author;
	}
	
	public String getNameBook() {
		return nameBook;
	}
	
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBook() {
		System.out.printf("\nName: %s\nAuthor: %s\n", nameBook, author);
	}
}
