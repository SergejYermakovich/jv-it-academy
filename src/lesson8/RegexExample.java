package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        String number = "3111175-29-299-12-12";
        String phoneNumberPattern = "375-[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}";

        Pattern pattern = Pattern.compile(phoneNumberPattern);


        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.find());
//        System.out.println(phoneNumberPattern.matches(number));


//        System.out.println(matcher.find());
//        System.out.println(matcher.start() + " " + matcher.end());
//        System.out.println(matcher.group());
//
//        System.out.println(matcher.find());
//        System.out.println(matcher.start() + " " + matcher.end());
//        System.out.println(matcher.group());
//
//        System.out.println(matcher.find());
////        System.out.println(matcher.start() + " " + matcher.end());
////        System.out.println(matcher.group());
    }
}
