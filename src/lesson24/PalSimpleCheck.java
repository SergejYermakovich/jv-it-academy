package lesson24;

public class PalSimpleCheck {
    public static void main(String[] args) {

// two pointers
        System.out.println(isPalindrome("ababa"));
        System.out.println(isPalindrome("ab"));
    }

    public static boolean isPalindrome(String word) {

        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        return reverseWord.toString().equals(word);
    }
}
