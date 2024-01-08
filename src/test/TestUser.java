package test;

public class TestUser {
    public static void main(String[] args) {
        User user = new User("Siarhei");

        user.addOrder("Pizza Pepperoni");
        user.addOrder("Water Mineral");

        user.processAllOrders();

    }
}
