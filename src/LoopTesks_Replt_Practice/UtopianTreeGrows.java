package LoopTesks_Replt_Practice;

public class UtopianTreeGrows {
    public static void main(String[] args) {

        int years = 0;
        int growth = 0;
        int size = 0;

        if (years <= 3) {

            for (years = 1; years <= 3; years++) {

                growth = 1;
                size += growth;

                System.out.println("Year" + years + " - growth " + growth + "cm");
                System.out.println("Tree size: " + size + "cm");
            }
        }
        if (years >= 4 && years <= 10) {
            for (years = 4; years <= 10; years ++) {
                growth = 2;
                size += growth;
                System.out.println("Year" + years + " - growth " + growth + "cm");
                System.out.println("Tree size: " + size + "cm");
            }

        }

    }
}
