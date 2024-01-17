package lesson13.hierarchy;

import lesson13.exceptionCoding.balance.NotEnoughMoneyException;

public class Main {

    public static void main(String[] args) {

        Money money = new Money("BYN", 1200);


        try {
            validateMoney(money);
        } catch (NotValidMoneyException e) {
            throw new RuntimeException(e);
        }


    }

    static void validateMoney(Money money) throws NotValidMoneyException {
        try {
            checkAmount(money.getAmount());
            checkCurrency(money.getCurrency());
        } catch (CurrencyNotSupportedException | NotEnoughMoneyException e) {
            throw new NotValidMoneyException("Money is not valid....", e);
        }
    }

    static void checkAmount(int amount) throws NotEnoughMoneyException {
        if (amount < 0) {
            throw new NotEnoughMoneyException("Not enough money on balance.....");
        }
    }

    static void checkCurrency(String currency) throws CurrencyNotSupportedException {
        if (currency.equals("BYN")) {
            throw new CurrencyNotSupportedException("Byn is not supported.....");
        }
    }

    public static class Money {
        private String currency;
        private int amount;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public Money(String currency, int amount) {
            this.currency = currency;
            this.amount = amount;
        }
    }
}
