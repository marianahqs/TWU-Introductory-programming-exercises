package primefactor;

import java.util.Scanner;

public class PrimeFactorMain {
    public static void main(String[] args) {

//*****************************************************************

        System.out.println("\n++++++++++ PRIME FACTPRS EXERCISE ++++++++++");
        Scanner keypad = new Scanner(System.in);
        System.out.print("\nType a number: ");

        int numberToCheck = Integer.parseInt(keypad.nextLine());

        PrimeFactorListGenerate exercise = new PrimeFactorListGenerate();
        System.out.println(exercise.generate(numberToCheck));
    }
}


