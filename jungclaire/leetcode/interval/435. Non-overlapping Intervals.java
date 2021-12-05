import java.util.Arrays;
import java.util.Comparator;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        int i = 1;
        int count = 0;
        while (i < intervals.length) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
                count++;
            }
            i++;
        }
        return count;
    }
}