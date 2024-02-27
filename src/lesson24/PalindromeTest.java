package lesson24;

public class PalindromeTest {
    public static void main(String[] args) {
        // "Хил, худ, а дух лих." -> "хил, худ, а дух лих." -> "хилхудадухлих"

        System.out.println(isPalindrome("Хил, худ, а дух лих.") == true);
        System.out.println(isPalindrome("1Хил, а дух лих.") == false);
    }

    private static boolean isPalindrome(String checkString) {
        String lowerCaseString = checkString.toLowerCase();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char currentSymbol = lowerCaseString.charAt(i);
            if (Character.isAlphabetic(currentSymbol) || Character.isDigit(currentSymbol)) {
                result.append(currentSymbol);
            }
        }

        String resultString = result.toString();
        return resultString.contentEquals(result.reverse());
    }
}
