/*
Create a simple library catalog and update a book's title in Java using HashMap. 
Begin from the initial structure provided and complete the library catalog. 
Update the title of an existing book and print the updated catalog.
*/

import java.util.HashMap;

class CreateCatalog {
    public static void main(String[] args) {
        // TODO: Create a HashMap named libraryCatalog with 'book1' and 'book2' as keys and their titles as values
        HashMap<String, String> libraryCatalog = new HashMap<>();
        libraryCatalog.put("book1", "Book 1");
        libraryCatalog.put("book2", "Book 2");      
        
        // TODO: Update the title for 'book1' in the HashMap
        libraryCatalog.put("book1", "Updated Book 1");

        // TODO: Print the updated title for 'book1'
        System.out.print(libraryCatalog.get("book1"));
    } 
}
