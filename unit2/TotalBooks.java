/*
You've been introduced to counting occurrences using HashMap in Java. Your task now is to efficiently count a 
collection of your favorite book titles, where duplicates may be present. You aim to track the total count for 
each title in the collection.
*/

import java.util.ArrayList;
import java.util.HashMap;

class TotalBooks {
    public static void main(String[] args) {
        // Create and initialize an ArrayList 'books' with some duplicated book titles of your choice
        // TODO: YOUR CODE 
        ArrayList<String> books = new ArrayList<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book1");
        books.add("Book1");
        books.add("Book3");
        
        // Create an empty HashMap 'bookCount' to store the count of each book
        // TODO: YOUR CODE HERE
        HashMap<String, Integer> bookCount = new HashMap<>();

        // Loop through each book in the 'books' list and count the occurrences
        for (String book : books) {
            // TODO: Check if the book is already in HashMap, if so increment its count, otherwise add it with count 1
            bookCount.put(book, bookCount.getOrDefault(book, 0) + 1);
        }

        // Finally, print the 'bookCount' HashMap
        // TODO: YOUR CODE HERE
        for (String book : bookCount.keySet()) {
            System.out.println(book + ": " + bookCount.get(book));
        }
    }    
}
