public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase()
                .replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "")
                .replaceAll(" ", "");
        StringBuffer sb = new StringBuffer(s);
        String reverseS = sb.reverse().toString();
        return s.equals(reverseS);
    }
}