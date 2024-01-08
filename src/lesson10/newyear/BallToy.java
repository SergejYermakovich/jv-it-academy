package lesson10.newyear;

public class BallToy extends TreeToy {

    @Override
    public void shine() {
        System.out.println("confetti shining.....");
    }

    @Override
    public void sound() {
        System.out.println("bim bom...");
    }

    public void sound(String sound) {
        System.out.println("Happy new year " + sound);
    }
}
