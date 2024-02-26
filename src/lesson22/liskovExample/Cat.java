package lesson22.liskovExample;

public class Cat extends Animal {

    @Override
    public void say() {
        System.out.println("Cat says: meeeeeow");
    }
}
