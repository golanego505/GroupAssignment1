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
	 * This get method is to make sure count is being iterrated correctly.
	 * @return count.
	 */
	public int getCount() {
		return this.count;
	}
	
	/**
	 * Adds a Book to the books array with the passed book.
	 * 
	 * @param book
	 * @return true if insertion was successful, false if array is full.
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
	 * Removes a book from the array if it exists
	 * @param book
	 * @return true if removal was successful, false if book could not be removed
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < 5; i ++) {
			if(books[i] != null && books[i].equals(book)){
				System.out.println("Removing Book: "+ books[i].toString());
				books[i] = null;
				this.count--;
				return true;
			}
		}
		System.out.println("Cannot remove book "+ book.toString());
		return false;
	}
	/**
	 * Displays each book in array with overriden toString in Book class.
	 */
	public void displayBooks() {
		for(Book book : books) {
			if(book != null) {
				String bookString = book.toString();
				System.out.println(bookString);
			}
		}
	}
	
}
