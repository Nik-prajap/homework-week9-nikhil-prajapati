package HomeWork_week9_Nikhil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 5. Write a Java Program to iterate through all elements in an array using Iterater.
 *
 */
public class Programme_5_ArrayListUsingIterater {

    public void arrayList() {

        // Declare the Hashset list
        Set<Integer> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        Iterator i = list.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Object Creation to call the Instance method.
        Programme_5_ArrayListUsingIterater obj = new Programme_5_ArrayListUsingIterater();
        obj.arrayList();
    }
}
