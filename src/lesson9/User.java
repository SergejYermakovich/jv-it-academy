package lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;

    private String password;

    private String[] orders;

    int orderCount;

    public User() {
    }


    public void addOrder(String order) {
        orders[orderCount] = order;
        orderCount++;
    }

    public void processOrders() {
        for (String order: orders) {
            if (order != null) {
                System.out.println("Delivering order " + order);
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return orderCount == user.orderCount && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Arrays.equals(orders, user.orders);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, password, orderCount);
        result = 31 * result + Arrays.hashCode(orders);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", orders=" + Arrays.toString(orders) +
                ", orderCount=" + orderCount +
                '}';
    }
}
