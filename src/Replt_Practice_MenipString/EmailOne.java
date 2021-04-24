package Replt_Practice_MenipString;

import java.util.Scanner;
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
 */
public class EmailOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")){

            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

            // First by replace(odl, new)
            System.out.println(email.replace(firstName, lastName));

            // By using indexOf()
            String remainOfEmail = email.substring(email.indexOf("@"), email.length());

            System.out.println(lastName + "_"+firstName + remainOfEmail);
        }else {
            System.out.println(email);
        }

    }
}
