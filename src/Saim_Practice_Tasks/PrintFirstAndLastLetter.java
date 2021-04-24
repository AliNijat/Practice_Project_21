package Saim_Practice_Tasks;

import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {

        //DO NOT CHANGE
       Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String test = word.charAt(0) + ""+word.charAt(word.length()-1);
        System.out.println(test);

    }
}
