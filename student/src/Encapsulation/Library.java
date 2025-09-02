package Encapsulation;

public class Library {
	 private int rollno;
     private int borrowed_books;
     final private int MAX_BORROW = 5;
     public void borrow_books() {
    	 if (borrowed_books < MAX_BORROW) {
             borrowed_books++;
             System.out.println("Book borrowed successfully. Total borrowed: " + borrowed_books);
         } else {
             System.out.println("Borrowing limit reached. You cannot borrow more than " + MAX_BORROW + " books.");
         }

     }
     public void returnBook() {
    	 if(borrowed_books>0) {
    		 borrowed_books--;
    		 System.out.println("No books available to return");
    	 }
    	 else {
    		 System.out.println("Book available to return");
    	 }
     }
     public int getborrowed_books() {
    	 return borrowed_books;
     }
     public static void main(String args[]) {
    	 Library l1 = new Library();
    	 l1.borrow_books();
     }
}
