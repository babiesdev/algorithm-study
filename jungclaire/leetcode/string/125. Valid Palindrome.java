class Solution125 {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toLowerCase().toCharArray();

        while (i <= j) {
            if (!Character.isLetterOrDigit(chars[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(chars[j])) {
                j--;
            } else if (chars[i++] != chars[j--]) {
                return false;
            }
        }
        return true;
    }
}