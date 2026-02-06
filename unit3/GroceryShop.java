/*
Now that you've familiarized yourself with data aggregation using HashMaps, it's time to put your skills to 
practical use! You are given a HashMap representing the inventory of a grocery shop, with fruit names as keys and their 
quantities as values. Your task is to write Java code that calculates the total number of items in the inventory and 
determines the maximum quantity of a single fruit type.
*/

import java.util.Collections;
import java.util.HashMap;

class GroceryShop {
    public static void main(String[] args) {
        // Inventory HashMap for a grocery shop
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("apples", 30);
        inventory.put("bananas", 45);
        inventory.put("oranges", 25);
        inventory.put("pears", 10);

        // TODO: Calculate the total items in the inventory and print it
        int total = 0;
        for (int itemCount : inventory.values()) {
            total += itemCount;
        }
        System.out.println("The total items in the inventory is " + total);

        // TODO: Find the maximum quantity of a single fruit type in the inventory and print it
        System.out.println("The maximum quantity of a single fruit type in the iventory is " + Collections.max(inventory.values()));
    }
}
