package lesson13.exceptionCoding.balance;

public class BalanceMain {
    public static void main(String[] args) {
        int balance = 100;

        try {
            checkBalance(balance);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkBalance(int balance) throws NotEnoughMoneyException {
        if (balance < 0) throw new NotEnoughMoneyException("Not enough money on your balance....");
        System.out.println("Balance is ok. Successful validation.");
    }

}
