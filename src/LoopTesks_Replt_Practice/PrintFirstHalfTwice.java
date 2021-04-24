package LoopTesks_Replt_Practice;

import java.util.Scanner;

/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: java

output: jaja
input: unity

output: unun
 */
public class PrintFirstHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        // write your code here

       int  firstHalf = word.length()/2;
       //String twicePrint = word.substring(0, firstHalf) + word.substring(0, firstHalf);
        //System.out.println(twicePrint);
       for (int i = 1; i <= 2; ){
           System.out.print(word.substring(0, firstHalf));
           i++;
       }

    }
}
