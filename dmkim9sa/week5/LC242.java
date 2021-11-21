package leetcode.week5;

import java.util.Arrays;

// Valid Anagram
public class LC242 {

    public static void main(String[] args) {
        boolean solution1 = isAnagram1("anagram", "nagaram");
        System.out.println("solution1 = " + solution1);
    }

    public static boolean isAnagram3(String s, String t) {

        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 97]++;
        for(int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 97]--;

        for (int i : alphabet) {
            if(i != 0) return false;
        }

        return true;
    }

    public static boolean isAnagram1(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
