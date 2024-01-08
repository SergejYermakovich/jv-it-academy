package lesson7;

public class AccessModifiers {

    protected int getProtectedFive() {
        return 5;
    }

    public int getPublicSix() {
        return getPrivateSeven() - 1;
    }

    private int getPrivateSeven() {
        return 7;
    }

    int getDefaultEight() {
        return 8;
    }
}
