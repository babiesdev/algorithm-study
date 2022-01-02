import java.util.*;

class Solution46 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] sortWord = str.toCharArray();
            Arrays.sort(sortWord);
            String word = String.valueOf(sortWord);

            if (!hashMap.containsKey(word))
                hashMap.put(word, new ArrayList<>());

            hashMap.get(word).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}