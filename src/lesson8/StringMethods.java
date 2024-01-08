package lesson8;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String company = "12 12 211 22 2 2 2 2 2 21212 2 2 2 2 2 12";

        System.out.println(company.length());
        System.out.println(company.charAt(3));
        System.out.println(company.equals("IT Academy"));
        System.out.println(company.toLowerCase());
        System.out.println(company.toUpperCase());
        System.out.println(company.equalsIgnoreCase("it Academy"));
        System.out.println(company.indexOf('A'));
        System.out.println(company.startsWith("A"));
        System.out.println(company.endsWith("A"));
        System.out.println(company.concat("A"));
        System.out.println(company.substring(0, 2));
        System.out.println(Arrays.toString(company.split(" ")));


        System.out.println(company.replace(" 2 ", " 3 "));

        System.out.println(company.contains("21121215551"));
    }
}
