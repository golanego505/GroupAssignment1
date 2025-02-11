package edu.mu.bookmanagementsystem;


public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}	
	
	public Book(String title, String author, String iSBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.price = price;
	}
	
	
		
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		Book book = (Book)obj;
		if(this.ISBN.equals(book.getISBN())) {
			return true;
		}
		return false;
	}		
}
