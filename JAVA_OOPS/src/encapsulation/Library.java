package encapsulation;

public class Library {
	private int rollno;
	private int borrowed_books;
	final private int MAX_BORROW=5;
	public void BorrowBook() {
		if(borrowed_books<MAX_BORROW) {
			borrowed_books++;
			System.out.println("The book has borrowed and total borrowed books are "+borrowed_books);
		}
		else {
			System.out.println("Cannot borrow the book more than 5");
		}
	}
	public void returnBook() {
		if(borrowed_books>0) {
			borrowed_books--;
			System.out.println("The book has been returned and total borrowed books are "+borrowed_books);
		}
		else {
			System.out.println("No book available to return");
		}
	}
	public int getborrowed_books() {
		return borrowed_books;
	}
}
