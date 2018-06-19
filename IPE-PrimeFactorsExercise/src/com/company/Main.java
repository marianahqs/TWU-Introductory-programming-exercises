package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//*****************************************************************
//Prime Factors Exercise

        System.out.println("\n++++++++++ PRIME FACTPRS EXERCISE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int numberToCheck = Integer.parseInt(keypad.nextLine());

        generate(numberToCheck);


    }


    private static Boolean isPrimeFactor(int number) {

        for (int i = 2; i <= number; i++) {

            if (number != i && number % i == 0) {
                break;

            } else if (number == i) {
                return true;

            }
        }

        return false;
    }


    private static void generate(int number) {

        String ch = "";

        for (int i=1; i<number;i++){

            if(number%i == 0 && isPrimeFactor(i)){

                ch += Integer.toString(i) +",";

            }
        }

        if (ch.length()>1){
            ch = ch.substring(0,ch.length()-1); // Removes the last comma from the result
            System.out.println(ch);

        }

    }


}


