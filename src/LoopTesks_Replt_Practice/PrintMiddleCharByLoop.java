package LoopTesks_Replt_Practice;

import java.util.Scanner;

/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
copied!
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      @@ ==>@@@@
      $$ ==>$$$$
      $$ ==>$$$$
      hi ==> hihi
 */
public class PrintMiddleCharByLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middleChar = 0;
        if (word.length() % 2 == 0 && word.length() >= 4) {
            middleChar = word.length() / 2;
            System.out.println(word.substring(middleChar - 1, middleChar + 1));

        } else if (word.length() % 2 != 0 && word.length() >= 3) {
            middleChar = word.length() / 2;
            System.out.println(word.substring(middleChar, middleChar + 1));

        } else if (word.length() == 2) {
            for (int i = 1; i <= 2; ) {
                System.out.print(word.substring(0, word.length()));
                i++;
            }
        } else {
            for (int j = 1; j <= 3; ) {
                System.out.print(word.substring(0, word.length()));
                j++;

            }
        }

    }
}
