package LoopTesks_Replt_Practice;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 0;
        int growth = 0;
        int treeSize = 0;

        if(year<=3){
            for(year=1; year<=3; year++){
                growth = 1;
                treeSize+=growth;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
            }

        }
        if(year>3 && year < 11){
            for(year =4; year<11; year++){

                growth = 2;
                treeSize+=growth;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
            }

        }



    }
}
