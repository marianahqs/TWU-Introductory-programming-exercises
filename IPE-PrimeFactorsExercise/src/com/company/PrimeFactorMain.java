package com.company;

import java.util.Scanner;

public class PrimeFactorMain {

    public static void main(String[] args) {


//*****************************************************************
//Prime Factors Exercise

        System.out.println("\n++++++++++ PRIME FACTPRS EXERCISE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int numberToCheck = Integer.parseInt(keypad.nextLine());

        PrimeFactorGenerate exercise = new PrimeFactorGenerate();

        System.out.println(exercise.generate(numberToCheck));

    }


}

