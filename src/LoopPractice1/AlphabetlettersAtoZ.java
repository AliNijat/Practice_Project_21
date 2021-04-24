package LoopPractice1;

import java.util.Scanner;

public class AlphabetlettersAtoZ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You want to lower or upper letters?");
        String answer = scan.next();

        System.out.println("You want to in ascending or descending order?");
        String order = scan.next();

        char start;
        char end;

        if (answer.toLowerCase().equals("upper") || answer.toLowerCase().equals("uppercase")) {

            start = 'A';
            end = 'Z';

        } else {
            start = 'a';
            end = 'z';
        }

        if (order.toLowerCase().equals("ascending") || order.toLowerCase().equals("ascen")) {

            for (int i = start; i <= end; i++) {
                System.out.print((char) i + " ");

            }
            System.out.println();
        } else if (order.toLowerCase().equals("descending") || order.toLowerCase().equals("descen")) {
            for (int i = end; i >= start; i--) {
                System.out.print((char) i + " ");
            }

        }
        System.out.println();

      /*  String answer = scan.next();
        String character = "";

        System.out.println("You want to in ascending or descending order?");
        String ascndgOder = scan.next();


        if (answer.equals("upper") || answer.equals("Upper") || answer.equals("uppercase")) {
            if (ascndgOder.equals("ascending") || ascndgOder.equals("Ascending") || ascndgOder.equals("ascen")) {
                for (char i = 'A'; i <= 'Z'; i++) {
                    character = "" + i;
                    System.out.print(character + " ");
                }
                System.out.println();
            } else if (ascndgOder.equals("descending") || ascndgOder.equals("Descending") || ascndgOder.equals("descen")) {
                for (char i = 'Z'; i >= 'A'; i--) {
                    character = "" + i;
                    System.out.print(character + " ");
                }
            }
        } else if (answer.equals("lower") || answer.equals("Lower") || answer.equals("lowercase")) {
            if (ascndgOder.equals("ascending") || ascndgOder.equals("Ascending") || ascndgOder.equals("ascen")) {
                for (char i = 'a'; i <= 'z'; i++) {
                    character = "" + i;
                    System.out.print(character + " ");
                }
                System.out.println();
            } else if (ascndgOder.equals("descending") || ascndgOder.equals("Descending") || ascndgOder.equals("descen")) {
                for (char i = 'z'; i >= 'a'; i--) {
                    character = "" + i;
                    System.out.print(character + " ");
                }
            }
        }

       */

    }
}
