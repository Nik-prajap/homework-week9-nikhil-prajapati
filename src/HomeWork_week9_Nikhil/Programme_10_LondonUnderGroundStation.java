package HomeWork_week9_Nikhil;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Programme that tells you which line passes through particular stations.
 * Just use Zone 1 Stations name.
 */
public class Programme_10_LondonUnderGroundStation {

    public void station(){
        ArrayList<String> st = new ArrayList<>();
        st.add("Angel");
        st.add("Bayswater");
        st.add("CoventGarden");
        st.add("Euston");
        st.add("Edgware");
        st.add("Farringdon");
        st.add("GreenPark");
        st.add("Hoxton");
        st.add("Knightsbridge");
        st.add("LondonBridge");
        st.add("Marylebone");
        st.add("Victoria");
        st.add("Waterloo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zone 1 Station names are : " + st);
        System.out.println(" ");
        System.out.println("Enter any Station Name from Above : ");
        String station = scanner.next();

        switch (station) {
            case "Angel":
                System.out.println("Lines pass from Angel Station : Northern Line");
                break;
            case "Bayswater" :
                System.out.println("Lines pass from Bayswater Station : Circle and District Line");
                break;
            case "CoventGarden" :
                System.out.println("Lines pass from CoventGarden Station : Picadilly Line");
                break;
            case "Euston" :
                System.out.println("Lines pass from Euston Station : Northern and Victoria Line");
                break;
            case "EdgwareRoad" :
                System.out.println("Lines pass from EdgwareRoad Station : Northern Line");
                break;
            case "Farringdon" :
                System.out.println("Lines pass from Farringdon Station : Elizabeth, Circle, Hammersmith and City and Metropolitan Line");
                break;
            case "GreenPark" :
                System.out.println("Lines pass from GreenPark Station : Jubilee, Picadilly and Victoria Line");
                break;
            case "Hoxton" :
                System.out.println("Lines pass from Hoxton Station : London Overground");
                break;
            case "Knightsbridge" :
                System.out.println("Lines pass from Knightsbridge Station : Picadilly Line");
                break;
            case "LondonBridge" :
                System.out.println("Lines pass from LondonBridge Station : Jubilee and Northern Line");
                break;
            case "Marylebone" :
                System.out.println("Lines pass from Marylebone Station : Baker Street Line");
                break;
            case "Victoria" :
                System.out.println("Lines pass from Victoria Station : Victoria Line, Circle and District Line");
                break;
            case "Waterloo" :
                System.out.println("Lines pass from Waterloo Station : Baker Street, Jubilee and Northern Line");
                break;
            default:
                System.out.println("Invalid Station name ");

        }
    }

    public static void main(String[] args) {
        Programme_10_LondonUnderGroundStation obj = new Programme_10_LondonUnderGroundStation();
        obj.station();
    }
}
