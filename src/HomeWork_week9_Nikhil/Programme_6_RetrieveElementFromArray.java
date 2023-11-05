package HomeWork_week9_Nikhil;

import java.util.ArrayList;

/** 6. Write a Java program to retrieve an element (at a specific index)
 * from a given array list
 *
 */
public class Programme_6_RetrieveElementFromArray {

    public void retrieveElementArray() {

        // Declare the ArrayList
        ArrayList<String> day = new ArrayList<>();
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        day.add("Friday");
        day.add("Saturday");
        day.add("Sunday");

        System.out.println(day);
        System.out.println(" ");

        String element = day.get(2);
        System.out.println("Third Element : " + element);

        element = day.get(5);
        System.out.println("Sixth element : " + element);
    }

    // Main Method
    public static void main(String[] args) {

        // Object Creation to call the Instance method.
        Programme_6_RetrieveElementFromArray obj = new Programme_6_RetrieveElementFromArray();
        obj.retrieveElementArray();

    }
}
