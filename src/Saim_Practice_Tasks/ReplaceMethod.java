package Saim_Practice_Tasks;
/*
Given a String message with some text and a number (1-3) replace certain characters from the String message.

When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'


    Ex:
        message: java class is fun
        number: 1
        Output: jeve cless is fun

    Ex:
        message: java class is fun
        number: 2
        Output: java clarr ir fun

 */
import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your texts here:");

        String text = input.nextLine();

        int numbers = input.nextInt();

        if (numbers == 1){
            String test = text.replace("a", "e");
            System.out.println(test);
        }else if (numbers == 2){
            String test = text.replace("s", "r");
            System.out.println(test);
        }else if (numbers == 3){
            String test = text.replace("o", "z");
            System.out.println(test);
        }else {
            System.out.println("Invalid data entered");
        }



        /*if (numbers == 1 ) {
            String test = sentence.replace("a", "e");
            System.out.println(test);
        }else if (numbers == 2){
            String test = sentence.replace("s", "r");
            System.out.println(test);
        }else if (numbers == 3){
            String test = sentence.replace("o", "z");
            System.out.println(test);
        }else {
            System.out.println("Invalid datat entered");
        }

         */



    }
}
