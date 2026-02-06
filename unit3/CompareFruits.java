/*
Now that you've got a handle on managing a fruit store's inventory with HashMap in Java, let's explore stock levels relative 
to the average. Your task is to determine how each fruit type's count compares to the average count in the store. Write Java 
code to calculate the difference between the fruit count and the store's average, and print out whether each fruit type has 
more, less, or exactly the average amount of stock.
*/

import java.util.HashMap;
import java.util.Map;

class CompareFruits {
    public static void main(String[] args) {
        // Creating a simple inventory containing a count of different fruit types
        HashMap<String, Integer> fruitInventory = new HashMap<>();
        fruitInventory.put("apples", 30);
        fruitInventory.put("bananas", 15);
        fruitInventory.put("cherries", 45);

        // TODO: Calculate the average count of the inventory items
        int totalCount = 0;
        for (int itemCount : fruitInventory.values()) {
            totalCount += itemCount;
        }
        double averageCount = (double) totalCount / fruitInventory.size();

        // Finding how much each fruit type's count differs from the average
        for (Map.Entry<String, Integer> fruit : fruitInventory.entrySet()) {
            double differenceFromAverage = fruit.getValue() - averageCount;
            String statusMessage;
            
            // TODO: Check if the count is greater, less, or equal to the average and set the appropriate message
            if (differenceFromAverage < 0) {
                statusMessage = "less fruits than average.";        
            } else if (differenceFromAverage == 0){
                statusMessage = "an everage number of fruits.";
            } else {
                statusMessage = "more fruits than average.";
            }
            
            System.out.println(fruit.getKey() + " has " + statusMessage);
        }
    }
    
}
