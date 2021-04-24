package Saim_Practice_Tasks;

import java.util.Locale;
import java.util.Scanner;

/**
 * A person will enter their address into a String. Make sure the String is not empty.
 *     If it is empty print: "No address found".
 *     If there is an address make all the text uppercase to match the expected format
 *
 *         Ex:
 *             Input: 231332 leaf ave, lake city 3132
 *             Output: 231332 LEAD AVE, LAKE CITY 3132
 *
 *         Ex:
 *             Input: ""
 *             Output: No address found
 */

     // isEmpty() ==> check if a string is empty or not
     // it's empty it will return true otherwise it will return false
     // And also this methods only accepts boolean
     // isEmpty() ==> length is == 0

public class isEmptyMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String address = input.nextLine();

        if (address.isEmpty()){
            System.out.println("No address found");
        }else {
            System.out.println(address.toUpperCase());
        }

    }
}
