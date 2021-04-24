package LoopPractice1;

import java.util.*;


public class MaxOf5Nums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");

        int firstNum = scan.nextInt();
        int maxNum = firstNum;
        int minNum = firstNum;

        System.out.println("Enter 4 more numbers:");
        for (int i = 1; i <= 5; i++) {
            int number = scan.nextInt();
            if (number > firstNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }

        System.out.println("max number: " + maxNum);
        System.out.println("min number: " + minNum);

        System.out.println("I did pushed on GitHub");


    }
}
