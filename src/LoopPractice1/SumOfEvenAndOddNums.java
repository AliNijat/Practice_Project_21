package LoopPractice1;

public class SumOfEvenAndOddNums {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        int i = 0;
        for (i = 1; i <=100; i++) {
            if (i % 2 == 0){

                sumEven += i;
            }else {
                sumOdd += i;
            }

        }
        System.out.println("sum of even numbers = " + sumEven + "\nsum of odd numbers = " + sumOdd);


        // all list of even and odd numbers
        for (int j = 1; j < 101; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");

            }
            if (j % 2 == 1){
                System.out.print(j + " ");
            }

        }
        System.out.println();

    }
}
