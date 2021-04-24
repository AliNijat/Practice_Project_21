package Saim_Practice_Tasks;

public class IndexAndLength {
    public static void main(String[] args) {


        String word = "java";

        System.out.println(word.charAt(0)+word.charAt(3));
        System.out.println(word.charAt(0)+ "" + word.charAt(3));

        System.out.println(word.length());
        System.out.println(word.charAt(word.length()-1));
        // System.out.println(word.charAt(word.length())); ==> String index out of range:



    }
}
