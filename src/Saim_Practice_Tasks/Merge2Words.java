package Saim_Practice_Tasks;

import java.util.Scanner;

public class Merge2Words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if (word1.length() == word2.length()) {
            String merge = "" +word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+
                    word1.charAt(2)+word2.charAt(2);
            System.out.println(merge);
        } else {
            System.out.println();
        }
    }

}
