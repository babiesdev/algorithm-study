package leetcode.week8;

import java.util.*;

/**
 * Group Anagrams
 * Related Topic: Hash Table, String, Sorting
 */
public class LC49 {

    public static void main(String[] args) {
        List<List<String>> solution = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        for (List<String> list : solution) {
            System.out.println(list.toString());
        }
    }

    public static List<List<String>> groupAnagrams(String[] str) {

        boolean[] visited = new boolean[str.length]; // 방문 지점 체크!!
        List<List<String>> lists = new ArrayList<>();

        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(i, str[i]);
        }

        for (int i = 0; i < str.length; i++) {
            if(visited[i]) continue; // 이미 리스트에 들어간 문자는 패스!!
            List<String> list = new ArrayList<>();

            visited[i] = true;
            list.add(str[i]);
            for (int j = i + 1; j < str.length; j++) {
                char[] ch1 = map.get(i).toCharArray();
                char[] ch2 = str[j].toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                if(Arrays.equals(ch1, ch2)) {
                    list.add(str[j]);
                    visited[j] = true;
                }
            }
            lists.add(list);
        }

        return lists;
    }
}
