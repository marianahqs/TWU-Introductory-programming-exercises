package diamondexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsoscelesTriangle {
    private int size;

    public IsoscelesTriangle(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return String.join("\n", this.pointingUpList());
    }

    public List<String> pointingDownList() {
        List<String> arrayResult = this.pointingUpList();
        Collections.reverse(arrayResult);
        return arrayResult;
    }

    public List<String> pointingUpList(){
        return collectTriangleLines(this.size);
    }

    private List<String> collectTriangleLines(int size) {
        List<String> arrayResult = new ArrayList<>();

        for (int lineIndex = 0; lineIndex < size; lineIndex++ ){
            int lastCharacterThisLine = size + lineIndex;
            int firstStarCharacterThisLine = size - lineIndex;
            arrayResult.add(buildLineString(lastCharacterThisLine, firstStarCharacterThisLine));
        }
        return arrayResult;
    }

    private String buildLineString(int lastCharacter, int firstStarCharacter) {
        StringBuilder stringResult = new StringBuilder("");

        for (int characterIndex = 1; characterIndex <= lastCharacter; characterIndex++) {
            if (characterIndex < firstStarCharacter) {
                stringResult.append(" ");

            } else {
                stringResult.append("*");
            }
        }
        return stringResult.toString();
    }
}
