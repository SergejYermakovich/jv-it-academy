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
        List<Leaf> lindenLeaves = initLeaves(100);


        for (int i = 0; i < quantity; i++) {
            if (i % 2 == 0) {
                trees.add(new Linden(lindenLeaves));
            } else {
                trees.add(new Fir(lindenLeaves));
            }

        }
        return trees;
    }

    private List<Leaf> initLeaves(int count) {
        List<Leaf> leaves = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            leaves.add(new Leaf());
        }

        return leaves;
    }
}
