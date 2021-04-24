package String_Practice2;
/*
[Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph

 */
import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.next();
        int middle= 0;

        if (word1.length() % 2 ==0 ){
            middle = (word1.length()/2);
            System.out.println("" + word1.charAt(middle-1) + word1.charAt(middle));


        }else {
            middle = (word1.length()/2);
            System.out.println(middle);
            System.out.println(word1.charAt(middle) );

        }


    }
}
