package String_Practice2;

/*
[SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +
Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
“Sender: actualSender”
“Number: actualNumber”
“Message: actualMessage”
 */
public class SMSParts {
    public static void main(String[] args) {

        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. " +
                "+ Message: {I love programming and problem solving}";

        // String sender = sms.substring(0, "Sender: ".length() );

        String message = sms.substring(sms.indexOf("{")+1, sms.indexOf("}"));
        String name = sms.substring(sms.indexOf("<")+1, sms.indexOf(">"));
        String number = sms.substring(sms.indexOf("[")+1, sms.indexOf("]"));

        System.out.println(message);
        System.out.println(number);
        System.out.println(name);
        //System.out.println(sender);

        System.out.println("______________________________________________");
        System.out.println("Sender: " + name + "\nNumber: "+ number + "\nMessage: " + message);


    }
}
