package LoopTesks_Replt_Practice;

import java.util.Scanner;

public class zomve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int i = 0;

        while (inhabitants >= 1) {
            System.out.println("Day " + i + " [" + inhabitants + "]");
            inhabitants /= 2;
            i++;
        }
        System.out.print("---- EXTINCT ----");
    }
}
