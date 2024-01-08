package lesson10;

import java.util.Random;

public class Device {
    private String model;
    private String price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int calculateDiscount() {
        return 15;
    }
}
