package lesson24;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /*
     * a -> 2
     * b -> 3
     *
     *
     * */

    //    abracadabr!a!!!   ->
    public static void main(String[] args) {
        System.out.println(canBeConstructed2("a", "b"));
        System.out.println(canBeConstructed2("aa", "ab"));
        System.out.println(canBeConstructed2("aa", "aab"));
    }

    public static boolean canBeConstructed2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] chars = new int[200];
        for (char symbol : magazine.toCharArray()) {
            chars[symbol]++;
        }

        for (char symbol : ransomNote.toCharArray()) {
            chars[symbol]--;
            if (chars[symbol] < 0) return false;
        }
        return true;
    }




    public static boolean canBeConstructed(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char symbol = magazine.charAt(i);
            if (magazineMap.get(symbol) == null) {
                magazineMap.put(symbol, 1);
            } else {
                int newValue = magazineMap.get(symbol) + 1;
                magazineMap.put(symbol, newValue);
            }
        }


        for (int i = 0; i < ransomNote.length(); i++) {
            char symbol = ransomNote.charAt(i);
            if (magazineMap.get(symbol) == null) {
                return false;
            } else {
                int newValue = magazineMap.get(symbol) - 1;
                if (newValue < 0) return false;
                magazineMap.put(symbol, newValue);
            }
        }

        return true;
    }
}
