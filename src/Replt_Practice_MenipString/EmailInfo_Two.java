package Replt_Practice_MenipString;

import java.util.Scanner;

/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
public class EmailInfo_Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String f = email.substring(0, email.indexOf("_"));
        String l = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String d = email.substring(email.indexOf("@")+1, email.indexOf("."));

        String firstName = f.substring(0, 1).toUpperCase() + f.substring(1);
        String lastName = l.substring(0, 1).toUpperCase() + l.substring(1);
        String domain = d.substring(0, 1).toUpperCase() + d.substring(1);

        System.out.println("First name: "+ firstName);
        System.out.println("Last name: "+ lastName );
        System.out.println("Domain: "+domain);

    }
}
