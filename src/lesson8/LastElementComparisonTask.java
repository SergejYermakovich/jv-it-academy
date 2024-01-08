package lesson8;

public class LastElementComparisonTask {

    /*
     * Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.
     *
     * */

    public static void main(String[] args) {
        String text = "it is a random text. I wanna be an extra programmer.";
        char lastSymbol = text.charAt(text.length() - 1);

        for (int i = 0; i < text.length(); i++) {
            if (lastSymbol == text.charAt(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
