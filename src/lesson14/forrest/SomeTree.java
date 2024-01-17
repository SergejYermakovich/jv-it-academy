package lesson14.forrest;

import java.util.ArrayList;
import java.util.List;

public abstract class SomeTree {
    private String name;
    private List<Leaf> leaves;

    private TreeType treeType;

    public SomeTree(String name, int leavesQuantity) {
        this.name = name;
        this.leaves = initLeaves(leavesQuantity);
    }

    private List<Leaf> initLeaves(int leavesQuantity) {
        leaves = new ArrayList<>(leavesQuantity);
        for (int i = 0; i < leavesQuantity; i++) {
            leaves.add(new Leaf());
        }
        return leaves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }
}
