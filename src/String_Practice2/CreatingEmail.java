package String_Practice2;
/*
[Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input:
JamesBond
Secret
output:
jameret@cybertek.com

 */

import java.util.Scanner;

public class CreatingEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first String");
        String firstSentence = input.nextLine();
        System.out.println("Enter your second String");
        String secondSentence = input.nextLine();


        if (firstSentence.length() == 6 && secondSentence.length() == 6){
            String first4Char =firstSentence.substring(0, (firstSentence.length()/2)+1);
            //System.out.println(first4Char);

            String last3Char = secondSentence.substring(secondSentence.length()/2);
            //System.out.println(last3Char);

            System.out.println(first4Char+last3Char+"@cybertek.com");

        }else {
            System.out.println("Invalid Data");
        }

    }
}
