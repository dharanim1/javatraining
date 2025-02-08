package BookManagementSystem;
import java.util.*;
class Library{
	private ArrayList<Book> books;
	public Library() {
		this.books=new ArrayList<>();
		
	}
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added:"+book.getTitle());
		
	}
	public void removeBook(String isbn) {
		for (Book book:books) {
			if (book.getIsbn().equals(isbn)) {
				books.remove(book);
				System.out.println("book removed:"+book.getTitle());
				return;
						
			}
	
	}
		System.out.println("book with Isbn"+isbn+ "not found.");
	}
	public Book searchByTitle(String title) {
		for(Book book: books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
	public boolean checkAvailability(String isbn) {
		for (Book book:books) {
			if (book.getIsbn().equals(isbn)) {
				return book.isAvailable();
			}
		}
		return false;
	}
	
    public void borrowBook(String isbn) {
    	for (Book book:books) {
    		if(book.getIsbn().equals(isbn)&& book.isAvailable()) {
    			book.setAvailable(false);
    			System.out.println("you have borrowed:"+book.getTitle());
    			return;
    		}
    	}
    	System.out.println("Book not available for borrowing");
    }
    public void returnBook(String isbn) {
    	for (Book book:books) {
    		if(book.getIsbn().equals(isbn)&&!book.isAvailable()) {
    			book.setAvailable(true);
    			System.out.println("you have returned:"+book.getTitle());
    			return;
    		}
    	}
    	System.out.println("This book was not borrowed or does not exist.");
    }
    public void displayBooks() {
		if (books.isEmpty()) {
    		System.out.println("No books available.");
    	}else {
    		System.out.println("\nLibraryBooks:");
    		for (Book book:books) {
    			book.displayBook();
    		}
    	}
    }
    public void sortBookByTitle() {
    	books.sort(Comparator.comparing(Book::getTitle));
    	System.out.println("Books sorted by title.");
    }
    public void sortBooksByAuthor() {
    	books.sort(Comparator.comparing(Book::getAuthor));
    	System.out.println("Books sorted by author.");
    }
}
