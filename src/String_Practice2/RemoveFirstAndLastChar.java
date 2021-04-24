package String_Practice2;
/*
[Remove first and last]
Given two words. Print the first word without its first character then print the second word
without its last character.
Input:
apple
banana
Output:
pple
banan
 */
import java.util.Scanner;

public class RemoveFirstAndLastChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.next();
        String word2 = in.next();

        System.out.println(word1.substring(1));
        System.out.println( word2.substring(0, word2.length()-1));
        // In this line of code I want to check
        System.out.println(word1.substring(1) + " "+ word2.substring(0, word2.length()-1));


    }
}
