package DiamondExercise;

import java.util.Scanner;

public class DiamondExerciseMain {

    public static void main(String[] args) {


//*****************************************************************
//Isosceles Triangle


        System.out.println("\n++++++++++ ISOSCELES TRIANGLE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int linesIsoscelesTriangle = Integer.parseInt(keypad.nextLine());

        IsoscelesTriangle myTriangle = new IsoscelesTriangle();

        myTriangle.isoscelesTriangleDrawer(linesIsoscelesTriangle, 0);




//*****************************************************************
//Diamond

        System.out.println("\n\n++++++++++ DIAMOND ++++++++++");

        System.out.print("\nType a number: ");

        int centerLineDiamond = Integer.parseInt(keypad.nextLine());

        IsoscelesTriangle myDiamond = new IsoscelesTriangle();

        myDiamond.isoscelesTriangleDrawer(centerLineDiamond, 0);

        myDiamond.upsideDownIsoscelesTriangleDrawer(centerLineDiamond-1, 1);



//*****************************************************************
//Diamond with Name

        System.out.println("\n\n++++++++++ DIAMOND WITH NAME ++++++++++");

        System.out.print("\nType a number: ");

        int centerLineDiamondName = Integer.parseInt(keypad.nextLine());

        IsoscelesTriangle myDiamondName = new IsoscelesTriangle();

        myDiamondName.isoscelesTriangleDrawer(centerLineDiamondName-1, 0);

        System.out.println("Mari");

        myDiamondName.upsideDownIsoscelesTriangleDrawer(centerLineDiamondName-1, 0);



   }

 //******************************************************************
 //Methods

    private static void diamondName(int centerLineDiamondName) {

        int lastLineDiamondName = 2*centerLineDiamondName-1;
        int numberCharactersLongerLine = lastLineDiamondName -2;


        for (int lineIndex = 1; lineIndex <= lastLineDiamondName; lineIndex++ ){

            String lineStringResult = "";

            int lastCharacterIndex = centerLineDiamondName + lineIndex;

            for (int characterIndex = 1; characterIndex< lastCharacterIndex; characterIndex++){   //Loop to build string

                int centerLineIndex = centerLineDiamondName - 1;

                if (lineIndex== centerLineIndex) {

                    lineStringResult = "Mari";

                } else {
                    int firstStarCharacterIndex = centerLineDiamondName - lineIndex;

                    if (characterIndex < firstStarCharacterIndex || characterIndex <= (lineIndex-centerLineDiamondName)){
                        lineStringResult += " ";  // If it is the start of the string it has white spaces

                    } else if (lineIndex<centerLineDiamondName || characterIndex < (numberCharactersLongerLine - (lineIndex-centerLineDiamondName+1))){

                        lineStringResult += "*"; // The last characters must be *
                    }
                }

            }


            System.out.print(lineStringResult+"\n");


        }
    }

    private static void diamond(int numberLines) {
        int max = numberLines+(numberLines-1); // Number of characters of the largest line

        for (int i = 0; i < max; i++ ){

            String ch = "";

            for (int a=0; a<(numberLines + i);a++){   //Loop to build string

                if (i==(numberLines-1)) {
                    ch += "*";  // If it is the last string it has only *

                } else if (a < (numberLines-i-1) || a <= (i-numberLines)){
                    ch += " ";  // If it is the start of the string it has white spaces

                } else if (i<numberLines || a < (max - (i-numberLines+1))){

                    ch += "*"; // The last characters must be *
                }

            }


            System.out.print(ch+"\n");

        }
    }


}
