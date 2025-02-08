package BookManagementSystem;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Library = new Library();
	    Scanner scanner = new Scanner(System.in); 
	    while (true) {
	    	System.out.println("\nBookManagement System");
	    	System.out.println("1.Add Book");
	    	System.out.println("2.Remove Book");
	    	System.out.println("3. Search book");
	    	System.out.println("4. display book");
	    	System.out.println("5. Boorow book");
	    	System.out.println("6. Return book");
	    	System.out.println("7. Check book Availability");
	    	System.out.println("8. Sort book by Title");
	    	System.out.println("9. Sort book by Author");
	    	System.out.println("10. exit");
	    	System.out.print("Enter choice");
	    	int choice =scanner.nextInt();
	    	scanner.nextLine();
	    	switch (choice) {
	    	case 1:
	    		System.out.print("Enter title:");
	    	    String title = scanner.nextLine();
	    	    System.out.print("enter author:");
	    	    String author = scanner.nextLine();
	    	    String isbn = scanner.nextLine();
	    	    System.out.print("Enter isbn:");
				Library.addBook(new Book(title,author,isbn));
				break;
	    	case 2:
	    		System.out.print("Enter isbn to remove:");
	    		String removeIsbn = scanner.nextLine();
	    		Library.removeBook(removeIsbn);
	    		break;
	    	case 3:
	    		System.out.print("Enter book title to search:");
	    		String searchTitle = scanner.nextLine();
	    		Book foundBook = Library.searchByTitle(searchTitle);
	    		if (foundBook != null) {
	    			System.out.println("Book found:");
	    			foundBook.displayBook();
	    		}else {
	    			System.out.println("Book not found");
	    			
	    		}
	    		break;
	    	case 4:
	    		Library.displayBooks();
	    		break;
	    	case 5:
	    		System.out.print("Enter ISBN to borrow:");
	    		String borrowIsbn = scanner.nextLine();
	    		Library.borrowBook(borrowIsbn);
	    		break;
	    	case 6:
	    		System.out.print("enter Isbn to return:");
	    		String returnIsbn = scanner.nextLine();
	    		Library.returnBook(returnIsbn);
	    		break;
	    	case 7:
	    		System.out.print("Enter ISBN to check availability:");
	    		String checkIsbn = scanner.nextLine();
	    		boolean isAvailable = Library.checkAvailability(checkIsbn);
	    		if (isAvailable) {
	    			System.out.println("the book is available");
	    		} else {
	    			System.out.println("the book is not available");
	    		}
	    		break;
	    	case 8:
	    		Library.sortBookByTitle();
	    		break;
	    	case 9:
	    		Library.sortBooksByAuthor();
	    		break;
	    	case 10:
	    		System.out.println("Exiciting");
	    		scanner.close();
	    		return;
	    		default:
	    			System.out.println("Involid choice");
	    		
	    		
	    	}
	    }

	}

}
