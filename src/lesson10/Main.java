package lesson10;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();


        Device virtualGlasses = new Device() {
            public int calculateDiscount() {
                return 17;
            }
        };




        System.out.println(virtualGlasses.calculateDiscount());
    }
}
