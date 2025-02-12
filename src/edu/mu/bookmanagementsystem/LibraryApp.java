package edu.mu.bookmanagementsystem;

public class LibraryApp {

	public static void main(String[] args) {
		//********************* Declarations ******************************
		Library library = new Library();
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 45.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 50.99);
		
		String ISBN = "978-0135166307"; //Search by ISBN using this ISBN
		
		
		//********************* Main Program ***********************
		System.out.println("Adding books...");
		
		//Adding books
		if(library.addBook(book1) && library.addBook(book2) && library.addBook(book3) == true){
			System.out.println("Books added successfully.\n");
		}
		else {
			System.out.println("Books unsuccessfully added.\n");
		}
		
		System.out.println("Searching for book with ISBN: " + ISBN);
		
		//Searching for books
		Book searchBook = library.searchByISBN(ISBN);
		
		if(searchBook != null) {
			System.out.println("Book found: " + searchBook.toString());
			System.out.println();
		}
		else {
			System.out.println("Book not found.");
		}
		// First display
		System.out.println("All books in the library:");
		library.displayBooks();
		
		
		if(library.removeBook(book2) == true) {
			System.out.println("\nRemoving book: "+ book2.toString() + "\n");
		}
		else {
			System.out.println("Cannot Remove book: "+ book2.toString());
		}
		
		
		System.out.println("All books in the Library:");
		
		//Last Display
		library.displayBooks();
		
		if(library.removeBook(book2) == true) {
			System.out.println("\nRemoving book: "+ book2.toString() + "\n");
		}
		else {
			System.out.println("\nCannot Remove book: "+ book2.toString());
		}
	}

}
