package LoopTesks_Replt_Practice;

import java.util.Scanner;

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */
public class GuestsList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        String guestName = "";
        String countinue = "";
        String questList = "";
        int count = 1;



        do {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new quest name?");
            countinue = input.next();
            questList += guestName + ", ";
            count++;

        } while (countinue.equalsIgnoreCase("yes"));

        System.out.println(questList.substring(0, questList.length() -2));

    }
}
