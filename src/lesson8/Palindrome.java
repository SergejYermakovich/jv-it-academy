package lesson8;

public class Palindrome {
    public static void main(String[] args) {
        String word = "woooow";

        System.out.println(isPalindrome(word));
    }


    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
