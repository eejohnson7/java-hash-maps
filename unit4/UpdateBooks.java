/*
Ready to put your skills to the test? Your mission is to manage a library's inventory in Java. 
Add code to update the stock of an existing book and to check if another book is present in the inventory. 
Use your understanding of HashMaps to complete this task!
*/

import java.util.HashMap;

class UpdateBooks {
    public static void main(String[] args) {
        // Maintain a simple inventory of books in a library using HashMap
        HashMap<String, Integer> libraryInventory = new HashMap<>();
        libraryInventory.put("BookA", 3);
        libraryInventory.put("BookB", 5);
        libraryInventory.put("BookC", 2);  // Existing books
        
        libraryInventory.put("BookD", 4);  // Adding a new book with its initial count
        
        // TODO: Update the stock for 'BookA' by adding 2 more to its current count
        libraryInventory.put("BookA", libraryInventory.getOrDefault("BookA", 0) + 2);
        // TODO: Print the updated stock count for 'BookA'
        System.out.println("Updated stock count for 'BookA': " + libraryInventory.get("BookA"));
        
        // TODO: Check if 'BookB' is in the inventory and print its stock count.
        if (libraryInventory.containsKey("BookB")) {
            System.out.println("Stock count for 'BookB': " + libraryInventory.get("BookB"));
            return;
        }
        // If it's not available, print "[Book Name] is not in stock."
        System.out.println("'BookB' is not in stock.");
    }
}
