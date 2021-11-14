public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.characterReplacement("ABAB", 2));
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        char[] lookup = new char[26];
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            lookup[idx]++;

            maxFreq = Math.max(maxFreq, lookup[idx]);
            if (end + 1 > maxFreq + k) {
                lookup[s.charAt(start) - 'A']--;
                start++;
            } else
                end++;
        }
        return end;
    }
}