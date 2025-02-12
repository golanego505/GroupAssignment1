package edu.mu.bookmanagementsystem;

public class Library {
	
	/**
	 * Two Attributes:
	 * book is an array of Book objects
	 * count is the number of Books within book array
	 */
	private Book[] books = new Book[5];
	private int count;
	
	/**
	 * Adds a Book to the books array with the passed book.
	 * Returns immediately if count equals the size of the array.
	 * @param book		The book being inserted.
	 * @return true if insertion was successful, false if array is full.
	 */
	public boolean addBook(Book book){
		
		if(this.count == 5) {
			return false;
		}
		
		for(int i = 0; i < 5; i ++) {
			if(books[i] == null) {
				books[i] = new Book(book);
				this.count++;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Removes a book from the array if it exists
	 * @param book		The book being removed.
	 * @return true if removal was successful, false if book could not be removed
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < 5; i ++) {
			if(books[i] != null && books[i].equals(book)){
				books[i] = null;
				this.count--;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Takes an ISBN and searches the array for the book that
	 * matches it.
	 * @param ISBN		The ISBN being searched for
	 * @return book object that is found, or null if not found
	 */
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < 5; i ++) {
			if(books[i] != null && books[i].getISBN().compareTo(ISBN) == 0) {
				return books[i];
			}
		}
		return null;
	}
	
	/**
	 * Displays each book in array with toString in Book class.
	 */
	public void displayBooks() {
		int count = 1;
		for(Book book : books) {
			if(book != null) {
				String bookString = book.toString();
				System.out.println(count + ". " + bookString);
				count++;
			}
		}
	}
	
}
