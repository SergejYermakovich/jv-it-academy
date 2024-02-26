package lesson22.interfacePrinciple;

public class Cat implements SimpleJump, CatJump {
    @Override
    public void doSimpleJump() {
        System.out.println("doSimpleJump");
    }

    @Override
    public void doSimpleCatJump() {
        System.out.println("doSimpleCatJump");
    }

    @Override
    public void doHardCatJump() {
        System.out.println("doHardCatJump");
    }

    @Override
    public void doMediumCatJump() {
        System.out.println("doMediumCatJump");

    }
}
