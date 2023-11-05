package HomeWork_week9_Nikhil;

/**
 * Write a java Program to reverse an array of integer values.
 */
public class Programme_3_ReverseAnArray {
    public void reverseAnArray(){
        int a[] = {1,2,3,4,5,6,7,8,9};

        System.out.println("Original Array : ");

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] + " ");

        System.out.println("-- - -- - -- - -- - -- - --");
        System.out.println("  Array in Reverse Order  ");
        System.out.println("-- - -- - -- - -- - -- - --");

        for (int i = a.length - 1; i >=0 ; i--)
            System.out.println(a[i] + " ");
    }

    // Main Method
    public static void main(String[] args) {

        // Object creation to call the instance class
        Programme_3_ReverseAnArray obj = new Programme_3_ReverseAnArray();
        obj.reverseAnArray();

    }
}
