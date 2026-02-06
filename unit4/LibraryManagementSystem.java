/*
You've already seen how powerful HashMaps are with our examples. Now, it's time to put your Java skills to the test with a 
Library Management System task. Your job is to check the availability of a specific book in the library. HashMaps in Java 
make it quite easy to manage such tasks. Show us what you've got and complete this challenge using your knowledge of 
HashMaps!
 */

import java.util.HashMap;

class LibraryManagementSystem {
    public static void main(String[] args) {
        // TODO: Define a 'libraryCatalog' using HashMap with a few books. 
        // Each book id as key and another HashMap as value containing details like title, author, and year_published        
        HashMap<String, String> book1 = new HashMap<>();
        book1.put("title", "Title 1");
        book1.put("author", "Author 1");
        book1.put("year_published", "2000");
        
        HashMap<String, String> book2 = new HashMap<>();
        book2.put("title", "Title 2");
        book2.put("author", "Author 2");
        book2.put("year_published", "2001");
        
        HashMap<String, HashMap<String, String>> libraryCatalog = new HashMap<>();
        libraryCatalog.put("001", book1);
        libraryCatalog.put("002", book2);

        // TODO: Assign a 'bookId' variable with the id of the book you want to check
        String bookId = "001";

        // TODO: Implement a search in 'libraryCatalog' to check if the 'bookId' exists and print the book details or "Book not found in the library catalog."
        if (libraryCatalog.containsKey(bookId)) {
            HashMap<String, String> book = libraryCatalog.get(bookId);
            for (String detail : book.keySet()) {
                System.out.println(detail + ": " + book.get(detail));
            }
        } else {
            System.out.println("Book not found in the library catalog.");
        }
    }
    
}
