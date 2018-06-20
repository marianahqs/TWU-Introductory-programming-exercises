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

        myDiamond.upsideDownIsoscelesTriangleDrawer(centerLineDiamond - 1, 1);


//*****************************************************************
//Diamond with Name

        System.out.println("\n\n++++++++++ DIAMOND WITH NAME ++++++++++");

        System.out.print("\nType a number: ");

        int centerLineDiamondName = Integer.parseInt(keypad.nextLine());

        IsoscelesTriangle myDiamondName = new IsoscelesTriangle();

        myDiamondName.isoscelesTriangleDrawer(centerLineDiamondName - 1, 0);

        System.out.println("Mari");

        myDiamondName.upsideDownIsoscelesTriangleDrawer(centerLineDiamondName - 1, 0);


    }
}
