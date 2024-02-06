package lesson18.preparing.tasks;

public class PalindromeChecker {
    public static void main(String[] args) {
        String checkedString = "фалаш";

        System.out.println(isPalindrome(checkedString));
    }

    static boolean isPalindrome(String checkedString) {
        for (int i = 0; i < checkedString.length()/ 2; i++){
            if (checkedString.charAt(i) != checkedString.charAt(checkedString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
