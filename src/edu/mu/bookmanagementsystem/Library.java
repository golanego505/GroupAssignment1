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
	 * 
	 * @param book
	 * @return true if insertion was successful, false if array full.
	 */
	public boolean addBook(Book book){
		
		for(int i = 0; i < 5; i ++) {
			if(books[i] == null) {
				books[i] = book;
				this.count++;
				return true;
			}
		}
		return false;
	}
	/**
	 * Displays each books author in book array. 
	 * USING FOR TESTING addBook method
	 */
	public void displayBooks() {
		for(Book book : books) {
			if(book != null) {
				System.out.println(book.getAuthor());
			}
		}
	}
	
}
