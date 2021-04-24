package Replt_Practice_MenipString;

import java.util.Scanner;
/*
Given a String txt print the value without the last letter

Ex:

Input:
foo
 */
public class RemoveLastLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String withOutlastLetter = txt.substring(0, txt.length()-1);
        System.out.println(withOutlastLetter);


    }
}
