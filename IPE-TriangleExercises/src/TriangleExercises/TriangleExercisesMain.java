package TriangleExercises;

import java.util.Scanner;

public class TriangleExercisesMain {

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

        int horizontalLineSize = Integer.parseInt(keypad.nextLine());

        int characterIndex;

        for (characterIndex = 0; characterIndex < horizontalLineSize; characterIndex++)

            System.out.print("*");


//*****************************************************************
//Draw a vertical line

        System.out.println("\n\n++++++++++ DRAW A VERTICAL LINE ++++++++++");

        System.out.print("\nType a number: ");

        int verticalLineSize = Integer.parseInt(keypad.nextLine());

        for (characterIndex = 0; characterIndex < verticalLineSize; characterIndex++)

            System.out.print("*\n");


//*****************************************************************
//Draw a right triangle

        System.out.println("\n\n++++++++++ DRAW A RIGHT TRIANGLE ++++++++++");

        System.out.print("\nType a number: ");

        int linesRightTriangle = Integer.parseInt(keypad.nextLine());

        String stringResult = "*";

        for (int lineIndex = 0; lineIndex < linesRightTriangle; lineIndex++) {

            System.out.print(stringResult + "\n");

            stringResult += "*";
        }

    }
}
