/*
You've been working with Java HashMap to count occurrences of each color in a list.
 Now, we'll focus on refining your skills to count elements in a list more efficiently. 
 Your task is to optimize the existing Java code that counts how many times each color appears by 
 using the HashMap features effectively!
 */

import java.util.ArrayList;
import java.util.HashMap;

class CountColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("blue");

        HashMap<String, Integer> colorMap = new HashMap<>();

        for (String color : colors) {
            /*
            // Check if the color is already in the map
            if (colorMap.containsKey(color)) {
                colorMap.put(color, colorMap.get(color) + 1);
            } else {
                colorMap.put(color, 1);  // Add the new color to the map with a count of 1
            }
            */
            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);
        }

        for (String key : colorMap.keySet()) {
            System.out.println(key + ": " + colorMap.get(key));
        }
    } 
}
