package diamondexercise;

import java.util.List;

public class Diamond {

    private int size;

    public Diamond(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        IsoscelesTriangle diamond = new IsoscelesTriangle(this.size);
        List<String> diamondList = diamond.pointingUpList();
        diamondList.remove(diamondList.size()-1);
        diamondList.addAll(diamond.pointingDownList());

        return String.join("\n", diamondList);
    }
}