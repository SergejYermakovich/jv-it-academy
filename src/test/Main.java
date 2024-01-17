package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final  String INPUT = "I am a magic string.";
        final  String INPUT2 = "I am a magic string.";


         byte[] ARRAY1 = INPUT.getBytes();
         byte[] ARRAY2 = INPUT2.getBytes();

        System.out.println(Arrays.equals(ARRAY1, ARRAY2));
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
