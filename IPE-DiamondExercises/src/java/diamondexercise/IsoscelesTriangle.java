package diamondexercise;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsoscelesTriangle {

    private int size;
    private boolean isUpsideDown;
    private int offset;


    public IsoscelesTriangle(int size,boolean isUpsideDown, int offset){
        this.size = size;
        this.isUpsideDown = isUpsideDown;
        this.offset = offset;

    }

    @Override
    public String toString() {
        return String.join("\n", this.pointingUp());
    }

    public List<String> pointingDown() {
        List<String> arrayResult;
        arrayResult = this.pointingUp();

        Collections.reverse(arrayResult);
        return arrayResult;
    }


    public List<String> pointingUp(){
        return collectTriangleLines(this.size, this.offset);
    }


    private List<String> collectTriangleLines(int size, int offset) {
        List<String> arrayResult = new ArrayList<String>();

        String stringResult;


        for (int lineIndex = 0; lineIndex < size; lineIndex++ ){

            int lastCharacterThisLine = size + lineIndex + offset;

            int firstStarCharacterThisLine = size - lineIndex +offset;

            stringResult = buildString(lastCharacterThisLine, firstStarCharacterThisLine);

            arrayResult.add(stringResult);

        }

        return arrayResult;
    }


    private String buildString(int lastCharacter, int firstStarCharacter) {

        String stringResult = "";

        for (int characterIndex = 1; characterIndex <= lastCharacter; characterIndex++) {
            if (characterIndex < firstStarCharacter) {
                stringResult += " ";

            } else {
                stringResult += "*";

            }
        }

        return stringResult;
    }


}
