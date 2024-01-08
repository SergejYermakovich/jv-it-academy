package lesson8;

public class StringBuilderDriver {
    public static void main(String[] args) {
        String str = "I study programming";

        StringBuilder strBuilder = new StringBuilder();



        strBuilder.append(str).append(" and English").append(". I write code every day!");
        System.out.println(strBuilder);

        strBuilder.reverse();
        System.out.println(strBuilder);

        strBuilder.reverse();
        System.out.println(strBuilder);



    }
}
