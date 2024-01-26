package test;

public class TestUser {
    public static void main(String[] args) {
        User user = new User("Siarhei");

        user.addOrder("Pizza Pepperoni");
        user.addOrder("Water Mineral");

        user.processAllOrders();



        System.out.println(assertInstanceOf(3333));

    }

    private static Integer assertInstanceOf(Number cause) {
        if (cause instanceof Integer serviceException) {
            return serviceException;
        }
        return 1;
    }
}
