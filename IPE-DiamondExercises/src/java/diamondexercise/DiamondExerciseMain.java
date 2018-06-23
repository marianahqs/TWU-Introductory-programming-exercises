package diamondexercise;

import java.util.Scanner;

public class DiamondExerciseMain {

    public static void main(String[] args) {

        System.out.println("\n++++++++++ ISOSCELES TRIANGLE ++++++++++");
        Scanner keypad = new Scanner(System.in);
        System.out.print("\nType a number: ");
        int triangleSize = Integer.parseInt(keypad.nextLine());

        IsoscelesTriangle myTriangle = new IsoscelesTriangle(triangleSize);
        System.out.print(myTriangle);

//*****************************************************************

        System.out.println("\n\n++++++++++ DIAMOND ++++++++++");
        System.out.print("\nType a number: ");
        int diamondCenter = Integer.parseInt(keypad.nextLine());

        Diamond myDiamond = new Diamond(diamondCenter);
        System.out.print(myDiamond);

//*****************************************************************

        System.out.println("\n\n++++++++++ DIAMOND WITH NAME ++++++++++");
        System.out.print("\nType a number: ");
        int diamondNameCenter = Integer.parseInt(keypad.nextLine());

        DiamondName myDiamondName = new DiamondName(diamondNameCenter);
        System.out.println(myDiamondName);
    }
}
