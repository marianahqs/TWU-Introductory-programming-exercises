package diamondexercise;

import java.util.List;

public class DiamondName {
    private int center;

    public DiamondName(int center){
        this.center = center;

    }


    @Override
    public String toString() {

        List<String> returnList;


        IsoscelesTriangle upsideDiamond = new IsoscelesTriangle(this.center-1,false,0);


        IsoscelesTriangle bottomDiamond = new IsoscelesTriangle(this.center-1,true,0);


        return upsideDiamond.toString() + "\nMARI\n" + bottomDiamond.toString();
    }


}
