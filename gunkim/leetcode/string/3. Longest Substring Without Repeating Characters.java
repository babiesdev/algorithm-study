class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;

        Set<Character> cache = new HashSet<>();

        while (j < s.length()) {
            char ch = s.charAt(j);

            if (cache.contains(ch) == false) {
                cache.add(ch);
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                cache.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}