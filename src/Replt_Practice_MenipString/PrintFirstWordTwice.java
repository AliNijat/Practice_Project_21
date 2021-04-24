package Replt_Practice_MenipString;

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

public class PrintFirstWordTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String half = word.substring(0,word.length());
        half.indexOf((word.length())/2);
        System.out.println(half );
    }
}
