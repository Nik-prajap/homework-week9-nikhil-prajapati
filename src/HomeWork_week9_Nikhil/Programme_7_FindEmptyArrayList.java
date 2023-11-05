package HomeWork_week9_Nikhil;

import java.util.ArrayList;

/**
 * Write a Java Program to test ia an array list is empty or not.
 */
public class Programme_7_FindEmptyArrayList {

    // Main Method
    public static void main(String[] args) {

        // Declare the ArrayList
        ArrayList mobileBrand = new ArrayList();
        printEmptyCheck(mobileBrand);
        mobileBrand.add("Apple");
        mobileBrand.add("Blackberry");
        mobileBrand.add("CAT");
        mobileBrand.add("Doogee");
        mobileBrand.add("Huawei");
        mobileBrand.add("Motorola");
        mobileBrand.add("Nokia");
        mobileBrand.add("OPPO");
        mobileBrand.add("Samsung");

        System.out.println(mobileBrand);
        printEmptyCheck(mobileBrand);
    }

    // Method to Check the above Arraylist is empty or not.
    static void printEmptyCheck(ArrayList mobileBrand) {
        if (mobileBrand.isEmpty())
            System.out.println(" The Array List is Empty");
        else System.out.println(" The Array List is not Empty");
    }
}
