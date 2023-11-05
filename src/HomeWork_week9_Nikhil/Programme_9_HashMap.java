package HomeWork_week9_Nikhil;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer values.
 * And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    // Main Method
    public static void main(String[] args) {

        System.out.println("Team Java = Age");

        // Declare the HaspMap
        HashMap<String, Integer> people = new HashMap<>();

        // .put used for HaspMap
        people.put("Mehul", 40);
        people.put("Nikhil", 43);
        people.put("Nimesh", 43);
        people.put("Dhara", 39);
        people.put("Indu", 38);
        people.put("Urveel", 37);

        //for loop used to iterate the value from the HasMap List
        for (Map.Entry<String, Integer> teamJava : people.entrySet()) {
            System.out.println(teamJava.getKey() + " = " + teamJava.getValue());
        }
    }
}
