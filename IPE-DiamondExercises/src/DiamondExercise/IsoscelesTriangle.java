package DiamondExercise;

public class IsoscelesTriangle {

    int linesIsoscelesTriangle;


    public IsoscelesTriangle(){

    }


    public void isoscelesTriangleDrawer(int linesIsoscelesTriangle, int offset){

        int numberCharactersLongerLine = (2 * linesIsoscelesTriangle -1) + offset;

        String stringResult = "";

        for (int lineIndex = 0; lineIndex < linesIsoscelesTriangle; lineIndex++ ){

            int lastCharacterThisLine = linesIsoscelesTriangle + lineIndex + offset;

            int firstStarCharacterThisLine = linesIsoscelesTriangle - lineIndex +offset;

            stringResult = buildString(lastCharacterThisLine, firstStarCharacterThisLine);

            System.out.print(stringResult+"\n");
        }

    }

    public void upsideDownIsoscelesTriangleDrawer(int linesIsoscelesTriangle, int offset){

        int numberCharactersLongerLine = (2 * linesIsoscelesTriangle -1) + offset;

        String stringResult = "";

        for (int lineIndex = linesIsoscelesTriangle-1; lineIndex >= 0; lineIndex-- ){

            int lastCharacterThisLine = linesIsoscelesTriangle + lineIndex + offset;

            int firstStarCharacterThisLine = linesIsoscelesTriangle - lineIndex + offset;

            stringResult = buildString(lastCharacterThisLine, firstStarCharacterThisLine);

            System.out.print(stringResult+"\n");
        }


    }


    public String buildString(int lastCharacter, int firstStarCharacter) {

        String stringResult = "";

        for (int characterIndex = 1; characterIndex <= lastCharacter; characterIndex++)

        {
            if (characterIndex < firstStarCharacter) {
                stringResult += " ";

            } else {
                stringResult += "*";

            }
        }

        return stringResult;
    }


}
