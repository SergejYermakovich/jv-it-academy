package lesson8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {

        BigDecimal currencyAmount = new BigDecimal("11.111").setScale(2, RoundingMode.DOWN);


        System.out.println(currencyAmount);
    }
}
