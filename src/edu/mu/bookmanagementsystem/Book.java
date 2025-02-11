package edu.mu.bookmanagementsystem;

/**
 * This class represents a book in a library system.
 * Book stores information
 * This information includes title, author, ISBN, and price
 */
public class Book {
	
	private String title;
	private String author;
	private String ISBN;	
	private double price;
	
	/**
	 * This is the default constructor that initializes all fields"
	 * The title is title, author, and ISBN are set to "Unknown"
	 * The price is set to 0.0
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}	
	
	/**
	 * Constructs a new Book with the specified title, author, ISBN, and price.
	 * 
	 * @param title		The title of the book.	
	 * @param author	The author of the book.		
	 * @param iSBN		The ISBN of the book.
	 * @param price		The price of the book.
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * Copy constructor constructs a new Book by copying the details from the existing book provided.
	 * @param book		The book provided supplies the information for the new book.
	 */
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}

	/**
	 * Gets the title of the book.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title of the book.
	 * @param title		The new title of the book.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author of the book.
	 * @return		The author of the book.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author of the book.
	 * @param author		The new author of the book.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the ISBN of the book.
	 * @return		The ISBN of the book.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN of the book.
	 * @param ISBN		The new ISBN of the book.
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * Gets the price of the book.
	 * @return		The price of the book.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price of the book.
	 * @param price		The new price of the book.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @Overrides toString() method to allow meaningful printing of book object.
	 * @return		A string representation of book.
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	/**
	 * @Overrides equals() method to compare two book objects.
	 * Compares the ISBN of both books to each other.
	 * @return		true if ISBN matches, false if ISBN does not match.
	 */
	@Override
	public boolean equals(Object obj){
		Book book = (Book)obj;
		if(this.ISBN.equals(book.getISBN())) {
			return true;
		}
		return false;
	}		
}
