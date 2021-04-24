package Saim_Practice_Tasks;

public class Concatnation3Primitve {
    public static void main(String[] args) {
        int a = 3, b = 2; // first will happen here a = 3
        long c = (a-- + b) * 2 / 3 % 2;
        //        1 + 2 * 2 / 3 % 2
        //         3 * 2 / 3 % 2
        //           6 / 3 % 2
        //            2 % 2
        //              0

        short c2 = (short) ((a-- + b) * 2 / 3 % 2);

        System.out.println(c2);
    }
}
