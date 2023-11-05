package HomeWork_week9_Nikhil;

import java.util.ArrayList;

/**
 * Write a Java Program to create a new array list, add some colours(String) and printout
 * the collection using for each loop.
 */
public class Programme_4_NewArrayList {
    public void colourString() {
        // Declare the ArrayList
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Blue");
        colour.add("Green");
        colour.add("Indigo");
        colour.add("Orange");
        colour.add("Red");
        colour.add("Violet");
        colour.add("Yellow");

        for (String colourString : colour) {
            System.out.println(colourString);
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Object Creation to call the Instance method
        Programme_4_NewArrayList obj = new Programme_4_NewArrayList();
        obj.colourString();
    }
}
