package Saim_Practice_Tasks;

/*
Given three String variables of some text find and print the longest word that also contains 'a'

        Ex:
        "java"
        "mouse"
        "computer"
        Output: java
        Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

        Challenge: Instead of just checking for 'a' add another variable
        that can be used to check for any character.

 */
public class Comparing3WordsLength {
    public static void main(String[] args) {

        String word1 = "java";
        String word2 = "mouse";
        String word3 = "apple";

        String longestWord ="";
        // String letter = "j";

        if (word1.contains("a") && word1.length() > longestWord.length()){
            longestWord = word1;
        }
        if (word2.contains("a") && word2.length() > longestWord.length()){
            longestWord = word2;
        }
        if (word3.contains("a") && word3.length() > longestWord.length()){
            longestWord = word3;
        }
        if (longestWord.isEmpty()){
            System.out.println("NO words conatains a");
        }else {
            System.out.println("Longest word is " + longestWord);

        }

        /*
        if (word1.contains(letter)){
            if (word1.length() > word2.length() && word1.length() > word3.length()){
                System.out.println(word1);
            }
        }else if (word2.contains(letter)){
            if (word2.length() > word1.length() && word2.length() > word3.length()){
                System.out.println(word2);
            }
        }else if (word3.contains(letter)){
            System.out.println(word3);
        }else {
            System.out.println("Invalid data");
        }

       if (word1.length() > word2.length() && word1.length() > word3.length()) {
            if (word1.contains(letter))
                System.out.println(word1);
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            if (word2.contains(letter))
                System.out.println(word2);
        } else if (word3.length() > word1.length() && word3.length() > word2.length()) {

            System.out.println(word3);

        }

         */


    }
}
