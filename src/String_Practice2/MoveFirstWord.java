package String_Practice2;

/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
-----------------------------------------------
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Java is fun, I am trying to learn it";

        // By finding the first space in new a variable
        int space = sentence.indexOf(" ");
        String firstWord1 = sentence.substring(0, space);
        System.out.println(firstWord1);

        // Without any variable, trough by indexOf
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        System.out.println(firstWord);

        // The rest of the sentence after moving the first word
        String remainOfSentence = sentence.substring(firstWord.length()+1);
        System.out.println(remainOfSentence);

        System.out.println("____________Expected Result____________");
        System.out.println(remainOfSentence + ", " + firstWord);





    }
}
