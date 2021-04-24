package Saim_Practice_Tasks;

import java.util.Scanner;

/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
 */
public class EnterValidPassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the new password");
        String validPass = input.next();

        System.out.println("Enter your user name");
        String userName = input.next();

        if (validPass.length() < 5 || userName.contains(validPass)){
            System.out.println(validPass + ": is not a valid password, let's try another one.");
        }else {
            System.out.println(validPass + "; is a valid password. You done");
        }

    }
}
