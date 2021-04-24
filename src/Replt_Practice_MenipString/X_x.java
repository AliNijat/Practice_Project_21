package Replt_Practice_MenipString;

import java.util.Scanner;

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: xHiX

output: Hi
input: apple

output: apple
input: apple

output: apple
input: xUxL

output: UxL
input: xUxL

output: UxL
input: JavaX

output: Java
 */
public class X_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String newWord = "";
        if (word.contains("X") || word.contains("x")){
            newWord = word.replace("X", "");
            System.out.println(newWord.replace("x", ""));


        }else {
            System.out.println(word);
        }
    }
}
