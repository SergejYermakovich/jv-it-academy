package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private String password;

    public List<String> orders;



    public User(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public void addOrder(String order) {
       orders.add(order);
    }


    public void processAllOrders() {
        for (String order: orders) {
            System.out.println("Delivering of " + order + " for " + name);
        }
    }
}
