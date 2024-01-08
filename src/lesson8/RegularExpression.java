package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String str = "Test - string - test";
        Pattern pattern = Pattern.compile(" +- +");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
            System.out.println(matcher.group());
        }


    }
}
