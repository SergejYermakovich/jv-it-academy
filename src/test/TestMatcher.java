package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {
    public static void main(String[] args) {
        String[] ipAddresses = {"127.0.0.1", "255.255.255.253", "100.99.44.2", "256.0.0.1", "abc.def.ghi.jkl"};

        Pattern patternIpAddress = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.");

        for (String ipAddress : ipAddresses) {
            Matcher matcherIpAddress = patternIpAddress.matcher(ipAddress);
            boolean isValidIpAddress = matcherIpAddress.matches();
            System.out.println(ipAddress + " is valid? " + isValidIpAddress);
        }

    }
}
