package lesson2;

public class LogicalOperators {
    public static void main(String[] args) {
        // &&
        // ||
        // !

        int legs = 3;
        int hours = 10;

        boolean isPerson = !(legs == 3);
        boolean isTimeGreaterThanNine = hours > 9;

        boolean isAccessOpen = isPerson || !isTimeGreaterThanNine;
        System.out.println(isAccessOpen);
    }
}
