package Replt_Practice_MenipString;

public class MiddleOne {
    public static void main(String[] args) {
        String word1 = "al";

        int middle = 0;
        if (word1.length() % 2 == 0) {
            if (word1.length() >= 4) {
                middle = (word1.length() / 2);
                System.out.println("" + word1.charAt(middle - 1) + word1.charAt(middle));

            } else {
//                int i =0;
//                for (i = 0; i >= 3; i++ )

                System.out.println(word1 + word1);
            }
        } else if (word1.length() % 2 != 0) {
            if (word1.length() >= 3) {
                middle = (word1.length() / 2);
                System.out.println("" + word1.charAt(middle));
            }
        }
    }
}
