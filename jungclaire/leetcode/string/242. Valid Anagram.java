class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String ss = new String(cs);
        String st = new String(ct);
        return ss.equals(st);
    }
}