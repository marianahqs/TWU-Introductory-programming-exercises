package diamondexercise;

import java.util.Collections;
import java.util.List;

public class Diamond {

    private int center;

    public Diamond(int center) {
        this.center = center;

    }


    @Override
    public String toString() {

        String returnString;


        IsoscelesTriangle upsideDiamond = new IsoscelesTriangle(this.center, false, 0);

        if (this.center > 1) {


            IsoscelesTriangle bottomDiamond = new IsoscelesTriangle(this.center - 1, true, 1);

            List<String> pointingUp = upsideDiamond.pointingUp();
            List<String> pointingDown = upsideDiamond.pointingDown();
            pointingDown.remove(0);

            pointingUp.addAll(pointingDown);

            returnString = String.join("\n", pointingUp);

        } else {

            returnString = upsideDiamond.toString();
        }

        return returnString;

    }
}