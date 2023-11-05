package HomeWork_week9_Nikhil;

import java.util.HashSet;

public class Programme_8_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> num = new HashSet<>();

        num.add(4);
        num.add(7);
        num.add(8);

        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " - Number Found *****");
            } else {
                System.out.println(i + " - Number not Found");
            }
        }
    }
}
