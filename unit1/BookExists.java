/*
Check if a certain book exists in our library catalog using Java. If it does, print "Book is available".
 If not, print that it's not in the catalog. Use the HashMap operations for this task.
*/

import java.util.HashMap;

class BookExists {
    public static void main(String[] args) {
        // Library Catalog
        HashMap<String, String> libraryCatalog = new HashMap<>();
        libraryCatalog.put("Moby Dick", "Herman Melville");
        libraryCatalog.put("The Great Gatsby", "F. Scott Fitzgerald");
        
        // TODO: Check if '1984' is in the libraryCatalog. If yes, print "Book is available". If no, print it's not in the catalog.
        if (libraryCatalog.containsKey("1984")) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not in catalog");
        }
    } 
}
