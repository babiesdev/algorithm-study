package leetcode.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Merge Intervals
public class LC56 {

    public static void main(String[] args) {

        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        // int[][] intervals = {{1, 4}, {2, 3}, {2, 4}};
        int[][] merge = merge(intervals);
        for (int[] m : merge) {
            System.out.println(Arrays.toString(m));
        }

    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            // 순서대로 정렬되어 있기 때문에 마지막 요소만 비교해보면 된다.
            int idx = list.size() - 1;

            int[] item = list.get(idx);
            if (intervals[i][0] <= item[1]) { // 이전 요소에 현재 요소가 포함되는 경우에
                if(intervals[i][1] > item[1]) {
                    list.get(idx)[1] = intervals[i][1];
                }
            }else {
                list.add(intervals[i]);
            }
        }

        return list.toArray(int[][]::new);
    }
}
