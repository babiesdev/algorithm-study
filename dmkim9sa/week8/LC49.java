package leetcode.week8;

import com.sun.source.tree.LiteralTree;

import java.util.*;

/**
 * Group Anagrams
 * Related Topic: Hash Table, String, Sorting
 */
public class LC49 {

    public static void main(String[] args) {
        List<List<String>> solution = groupAnagrams2(new String[]{"eat","tea","tan","ate","nat","bat"});
        for (List<String> list : solution) {
            System.out.println(list.toString());
        }
    }

    public static List<List<String>> groupAnagrams2(String[] str) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        if(str == null) return result;

        for (int i = 0; i < str.length; i++) {
            char[] next = str[i].toCharArray();
            Arrays.sort(next);
            String temp = String.valueOf(next);

            if (map.containsKey(temp)) {
                map.get(temp).add(str[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str[i]);
                map.put(temp, list);
            }
        }

        for (List<String> value : map.values()) result.add(value);
        return result;
    }

    public static List<List<String>> groupAnagrams1(String[] str) {

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
                if(map.get(i).length() != str[j].length()) continue;
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
