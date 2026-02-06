/*
Determine the maximum count of any one type of fruit in a fruit stand's inventory using Java. 
Utilize your knowledge on data aggregation with HashMap to accomplish this task.
 */

import java.util.Collections;
import java.util.HashMap;

class MaxQuantity {
    public static void main(String[] args) {
        // TODO: Create a HashMap representing the inventory with fruits as keys and their quantities as values
        HashMap<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("apples", 23);
        fruitCounts.put("bananas", 12);
        fruitCounts.put("grapes", 7);

        // TODO: Use the Collections.max method to find the max count of a single type of fruit
        int maxQuantity = Collections.max(fruitCounts.values());

        // TODO: Print out the maximum count of any fruit in the inventory
        System.out.println("The maximum count of any fruit in the inventory is " + maxQuantity);
    }
}
