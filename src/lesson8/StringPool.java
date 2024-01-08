package lesson8;


public class StringPool {
    public static void main(String[] args) {

        String cat = "meow";

        String cat2 = "meow";

        String cat3 = new String("meow222").intern();
        String cat4 = "meow222";
    }
}
