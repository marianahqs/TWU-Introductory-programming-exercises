package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//*****************************************************************
//Prime Factors Exercise

        System.out.println("\n++++++++++ PRIME FACTPRS EXERCISE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int npfe = Integer.parseInt(keypad.nextLine());

        generate(npfe);


    }


    private static String primeFactor(int number) {

        for (int i = 2; i <= number; i++) {

            if (number != i && number % i == 0) {
                break;

            } else if (number == i) {
                return Integer.toString(i);
            }
        }

        return null;
    }


    private static void generate(int n) {

            String ch = "";

            for (int i=1; i<n;i++){

                if(n%i == 0 && primeFactor(i) != null){

                    ch += primeFactor(i)+",";

                }
            }

        ch = ch.substring(0,ch.length()-1); // Removes the last comma from the result
        System.out.println(ch);
    }



}


