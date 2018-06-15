package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//****************************************************************
//Easiest exercise ever

        System.out.println("\n+++++++++ EASIEST EXERCISE EVER ++++++++++");
        System.out.println("\n*");


//****************************************************************
//Draw a horizontal line


        Scanner keypad = new Scanner(System.in);

        System.out.println("\n++++++++++ DRAW A HORIZONTAL LINE ++++++++++");

        System.out.print("\nType a number: ");

        int nh = Integer.parseInt(keypad.nextLine());

        for (int i = 0; i < nh; i++ )

           System.out.print("*");


//*****************************************************************
//Draw a vertical line

        System.out.println("\n\n++++++++++ DRAW A VERTICAL LINE ++++++++++");

        System.out.print("\nType a number: ");

        int nv = Integer.parseInt(keypad.nextLine());

        for (int i = 0; i < nv; i++ )

            System.out.print("*\n");


//*****************************************************************
//Draw a right triangle

        System.out.println("\n\n++++++++++ DRAW A RIGHT TRIANGLE ++++++++++");

        System.out.print("\nType a number: ");

        int nrt = Integer.parseInt(keypad.nextLine());

        String ch = "*";

        for (int i = 0; i < nrt; i++ ){

            System.out.print(ch+"\n");
            ch += "*";
        }

    }
}
