package LoopTesks_Replt_Practice;

import java.util.*;

public class ZombieAttack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;


        for (day = 0;  inhabitants >= 1 ;  day ++) {

            System.out.println("Day " + day + " [" + inhabitants + "]");

            inhabitants/=2;

        }
    }
}
