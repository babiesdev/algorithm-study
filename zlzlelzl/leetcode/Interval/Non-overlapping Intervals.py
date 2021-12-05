class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: [x[1], -x[0]])

        last = -10e5
        answer = 0

        for interval in intervals:
            a, b = interval

            if a < last:
                answer += 1
            else:
                last = b

        return answer
