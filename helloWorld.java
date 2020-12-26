import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {

        double poundToKilogram = 0.45359237;
        double kilogramToPound = 2.20462262;
        int loop = 1;

        while (loop == 1) {
            System.out.println("ENTER THE NUMBER OF OPERATION YOU WANT TO USE : ");
            System.out.println("1-) POUNDS TO KILOGRAMS");
            System.out.println("2-) KILOGRAMS TO POUNDS");


            Scanner keyboard = new Scanner(System.in);
            int whichConversion = keyboard.nextInt();

            if (whichConversion == 1) {
                System.out.println("INPUT THE NUMBER OF POUNDS THAT YOU WANT TO CONVERT TO KILOGRAMS : ");

                double inputNumberPound = keyboard.nextDouble();

                System.out.println("THE NUMBER OF KILOGRAMS IS : " + inputNumberPound * poundToKilogram);
            } else if (whichConversion == 2) {
                System.out.println("INPUT THE NUMBER OF KILOGRAMS THAT YOU WANT TO CONVERT TO POUNDS : ");

                double inputNumberKilogram = keyboard.nextDouble();

                System.out.println("THE NUMBER OF POUNDS IS : " + inputNumberKilogram * kilogramToPound);
            } else {
                System.out.println("INVALID INPUT - PLEASE ENTER THE CORRECT NUMBER OF OPERATION YOU WANT TO PERFORM");

            }

            System.out.println("DO YOU WANT TO PERFORM ANOTHER CALCULATION? (YES/NO)");
//            boolean userWantsLoop = keyboard.nextBoolean();
            String positive = "YES";
            String negative = "NO";
            String userWantsLoop = keyboard.next();


            if (userWantsLoop.equals(positive)) {
                loop = 1;
            } else if (userWantsLoop.equals(negative)) {
                loop = 2;
                System.out.println("TERMINATING THE PROGRAM!");
            } else {
                System.out.println("INVALID INPUT - PLEASE ONLY INPUT YES OR NO");
                System.exit(0);
            }


        }
    }
}
