package Replt_Practice_MenipString;
/*
Given a String variable word print the middle three characters
if the word is an odd number of characters and has more than 5 characters.
If the word does not meet the requirements print invalid.

fifteen ==> fte
apple ==> ppl

hey ==> invalid
java ==> invalid

whatsup ==> ats

$ ==> invalid
 */
import java.util.Scanner;

public class Print3MiddleLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middles = 0;

        if ( word.length() % 2 != 0 && word.length() > 5){
            middles = word.length()/2;
            // first formula by charAt()
            System.out.println("" + word.charAt(middles-1) + word.charAt(middles) + word.charAt(middles+1));

            // second formula by substring()
            System.out.println( word.substring(middles-1, middles+2));
        }else {
            System.out.println("Invalid");
        }
    }
}
