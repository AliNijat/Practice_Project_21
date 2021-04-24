package Saim_Practice_Tasks;

import java.util.Scanner;

/*

Given a String variable with a message. You will check if the message contains any of these bad words:
       “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */
public class ContainsMethod2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");

        String words = scan.nextLine();

        /* if (words.contains("idiot") || words.contains("dumb") || words.contains("heck")){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }

         */

        String result = words.contains("idiot")? "Message not sent" :
                        words.contains("dumb")? "Message not sent" : words.contains("keck") ? "Message not sent"
                                : "Message sent";

        System.out.println(result);




    }
}
