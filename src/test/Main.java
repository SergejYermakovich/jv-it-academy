package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread t2 = new Thread(() -> {
            synchronized (t1) {
                t1.start();
                try {
                    t1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t2.start();

        Thread.State t1State = t1.getState();
        Thread.State t2State = t2.getState();

        System.out.println("t1 state: " + t1State);
        System.out.println("t2 state: " + t2State);

    }


    private static Map<String, Object> getTemplateValues() {
        return Map.of(
                "REFERENCE_NUMBER"," request.referenceNumber()",
                "BANK_OPERATION_CODE", "request.bankOperationCode()",
                "VALUE_DATE_CURRENCY_AMOUNT", "request.valueDateCurrencyAmount()",
                "SENDER", "'rtyui",
                "BENEFICIARY_BANK", "request.beneficiaryBank()",
                "BENEFICIARY", "request.beneficiary().replaceAll ",
                "REMITTANCE_INFO", "request.remittanceInfo()",
                "CHARGE_DETAILS"," request.detailsOfCharge()",
                "PAYMENT_DETAILS", null,
                "INTERMEDIARY_BANK_CORRESPONDENT_ACCOUNT", "request.intermediaryBankCorrespondentAccount()"
        );
    }

}
