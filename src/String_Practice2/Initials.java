package String_Practice2;

import java.util.Scanner;

/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB

 */
public class Initials {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstName = in.next();
        String lasName = in.next();

        // first formula
        String initial = firstName.charAt(firstName.length()-1) + ""+ lasName.charAt(0);
        System.out.println("" + initial.toUpperCase());

        // second formula
        String s = in.nextLine();
        String fullName = in.nextLine();

        String firstInitial = "" + fullName.charAt(fullName.indexOf(" ")-1);
        String lastInitial = "" + fullName.charAt(fullName.indexOf(" ")+1);
        System.out.println(firstInitial+ lastInitial);


    }
}
