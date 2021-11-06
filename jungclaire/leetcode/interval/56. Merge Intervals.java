class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        List<int[]> mergedIntervals = new ArrayList<>();
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int newStart = interval[0];
            int newEnd = interval[1];

            if (currentEnd >= newStart) {
                currentInterval[1] = Math.max(currentEnd, newEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}