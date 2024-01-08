package lesson8;

public class Exs {
    public static void main(String[] args) {
        String message = "cat goes by cat cat cattssss";
        String cat = "cat";

        String name = new String("San").intern();

        String[] catArray = message.split(" ");

        int catCount = 0;
        for (String word: catArray) {
            if (cat.equals(word)) {
                catCount++;
            }
        }

        System.out.println("I have " + catCount + " cats.");

    }
}
