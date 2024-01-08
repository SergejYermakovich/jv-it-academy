package lesson10.instanceOfex;

import lesson10.Computer;
import lesson10.Device;
import lesson10.newyear.BallToy;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();


        if (computer instanceof Object) {
            System.out.println("этот объект - Device!!!!");
        }


    }
}
