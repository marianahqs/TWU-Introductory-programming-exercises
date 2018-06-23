package diamondexercise;

import java.util.List;

public class DiamondName {
    private int size;

    public DiamondName(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        IsoscelesTriangle diamondName = new IsoscelesTriangle(this.size-1);
        List<String> diamondNameList = diamondName.pointingUpList();
        diamondNameList.add("MARI");
        diamondNameList.addAll(diamondName.pointingDownList());

        return String.join("\n", diamondNameList);
    }
}
