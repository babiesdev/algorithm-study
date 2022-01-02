package leetcode.week8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Non-overlapping Intervals
 * Related Topic : DP, Greedy, Sorting, Array
 * */
public class LC435 {

    public static void main(String[] args) {
        int solution = eraseOverlapIntervals(new int[][]{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}});
        System.out.println("solution = " + solution);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        int count = 0;
        int prevEnd = intervals[0][1]; // 이전 배열의 끝 지점

        int i = 1;
        while (i < intervals.length) {
            int currStart = intervals[i][0]; // 현재 배열의 시작 지점
            System.out.println("prevEnd = " + prevEnd + "   currStart = " + currStart);
            if(prevEnd > currStart) { // 연속된 범위가 아닌 경우
                count++;
            }else {
                prevEnd = intervals[i][1];
            }
            i++;
        }

        return count;
    }
}
