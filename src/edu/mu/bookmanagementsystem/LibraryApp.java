package edu.mu.bookmanagementsystem;

public class LibraryApp {

	public static void main(String[] args) {
		System.out.println("Testing with correct Java Package...");
		
		Library library = new Library();
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 45.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 50.99);
		
		if(library.addBook(book1) && library.addBook(book2) && library.addBook(book3) == true){
			System.out.println("Books added successfully");
		}
		else {
			System.out.println("Books unsuccessfully added.");
		}
		
		System.out.println("Searching for book with ISBN: 978-0135166307");
		
		Book searchBook = library.searchByISBN("978-0135166306");
		
		if(searchBook != null) {
			System.out.println("Book found: " + searchBook.toString());
		}
		else {
			System.out.println("Book not found.");
		}
		
		library.displayBooks();
		
		System.out.println(library.getCount());

	}

}
