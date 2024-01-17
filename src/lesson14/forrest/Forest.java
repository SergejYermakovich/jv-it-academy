package lesson14.forrest;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<SomeTree> trees;

    public Forest(int quantityOfTrees) {
        trees = initTrees(quantityOfTrees);
    }

    public List<SomeTree> getTrees() {
        return trees;
    }

    public void setTrees(List<SomeTree> trees) {
        this.trees = trees;
    }

    private List<SomeTree> initTrees(int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (i % 2 == 0) {
                trees.add(new Linden());
            } else {
                trees.add(new Fir());
            }

        }
        return trees;
    }
}
