package LoopPractice1;

public class EvenAndOddNumDivisibleBy3And5 {
    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println();

//        for (int i = 0; i <= 100; i++) {
//
//            if (i % 2 == 0) {
//                if (i % 3 == 00 && i % 5 == 0) {
//                    sumOfEven += i;
//                }
//
//            } else  if (i % 2 != 0){
//                if (i % 3 == 00 && i % 5 == 0) {
//                    sumOfOdd += i;
//                }
//            }
//
//        }
//        System.out.println("Sum of even number that are divisible by 3 and 5 = " + sumOfEven);
//        System.out.println("Sum of odd number that are divisible by 3 and 5 = " + sumOfOdd);

    }
}
