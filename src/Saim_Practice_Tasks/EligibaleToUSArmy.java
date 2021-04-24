package Saim_Practice_Tasks;

public class EligibaleToUSArmy {
    public static void main(String[] args) {

        String citizenship = "USA";
        boolean resident = false;
        int age = 20;
        boolean hasDiploma = false;

        if (citizenship.equalsIgnoreCase("USA") || resident){
            if (age >= 18 && age <= 35){
                if (hasDiploma) {
                    System.out.println("You are qualified to the US army");
                }else {
                    System.out.println("You must have a high school diploma");
                }
            }else{
                System.out.println("Your age must to be between 18 and 35 years old");
            }
        }else {
            System.out.println("You must be a US citizen or a resident");
        }



    }
}
