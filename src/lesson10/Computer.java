package lesson10;

import java.util.Random;

public class Computer extends Device {

    private String ram;
    private Mouse mouse;

    public Computer() {
        this("2 GB");
    }

    public Computer(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public int calculateDiscount() {
        return super.calculateDiscount() + 1;
    }

    public int calculatePrice() {
        return this.calculateDiscount() == 0 ? 500 : 400;
    }


    class Mouse {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
