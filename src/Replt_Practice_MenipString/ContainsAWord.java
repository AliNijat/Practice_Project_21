package Replt_Practice_MenipString;

import java.util.Scanner;

/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: javapython

output: true
input: cjavac++

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
 */
public class ContainsAWord {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.contains("java") || word.contains("Java") || word.contains("JAVA")){
            System.out.println(true);
            if ( word.indexOf(0, 1) == word.charAt('j') || word.indexOf(1, 2 ) == word.charAt('j')){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }

    }
}
