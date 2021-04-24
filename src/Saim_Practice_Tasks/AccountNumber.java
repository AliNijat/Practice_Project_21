package Saim_Practice_Tasks;
/*
[Account Number]

Declare a variable account number (String). You will check if these account numbers are valid.
    - If the account number begins with a “2” the account number should be 7 characters long
        -> Print: "Valid 7 digit account number"
            Otherwise: "Invalid 7 digit account number"
    - If the account number begins with a “5” the account number should be 10 characters long
        -> Print: "Valid 5 digit account number"
            Otherwise: "Invalid 5 digit account number"
    — If the account number does not begin with a 2 or a 5
        -> Print "Invalid account number"
 */

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String accountNum = scan.next();

        if (accountNum.startsWith("2")) {
            if (accountNum.length() == 7) {
                System.out.println("valid 7 digit account number");
            } else {
                System.out.println("Not a valid 7 digit account number");
            }
        } else if (accountNum.startsWith("5")) {
            if (accountNum.length() == 10) {
                System.out.println();
                System.out.println("valid 10 digit account number");
            } else {
                System.out.println("Not a valid 10 digit account number");
            }
        } else {
            System.out.println("Not a valid account number");
        }



    }
}
