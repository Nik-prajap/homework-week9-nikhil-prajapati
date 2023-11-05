package HomeWork_week9_Nikhil;

import java.util.ArrayList;

/**
 * Declare following two array list and compare it
 * ArrayList<String> c1= ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2 = new ArrayLisy<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 *
 */
public class Programme_11_CompareArrayListString {

    //Main Method
    public static void main(String[] args) {

        // Declare the first ArrayList
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare the Second ArrayList
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Compare the above two ArrayList and Print
        System.out.println(c1.equals(c2));
    }
}
