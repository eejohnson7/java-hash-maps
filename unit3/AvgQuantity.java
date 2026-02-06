/*
In your grocery store inventory system, you have code that currently calculates the maximum quantity of items. 
Now, you need to modify the code to calculate the average quantity of items in the inventory. 
To achieve this, use Java's iterative methods to sum the quantities and then divide by the number of items. 
Ready for the challenge?
 */

import java.util.HashMap;

class AvgQuantity {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("potatoes", 30);
        inventory.put("carrots", 25);
        inventory.put("onions", 15);

        // Finding the maximum quantity among the inventory
        /*
        int maxQuantity = Collections.max(inventory.values());
        System.out.println("The maximum quantity of any item in the shop is: " + maxQuantity);
        */
        
        int total = 0;
        for (Integer value : inventory.values()) {
            total += value;
        }
        
        double avgQuantity = (double) total / inventory.size();
        System.out.printf("The average quantity of each item in inventory is %.2f%n", avgQuantity);
    }
}
