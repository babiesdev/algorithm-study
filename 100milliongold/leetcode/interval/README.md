# Interval

## 56. Merge Intervals

intervals[i] = [starti, endi] 인 간격 배열이 주어지면 겹치는 모든 간격을 병합하고 입력의 모든 간격을 포함하는 겹치지 않는 간격의 배열을 반환합니다.

### Example 1:

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
설명: 구간 [1,3]과 [2,6]이 겹치므로 [1,6]으로 병합합니다.
```


### Example 2:

```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
설명: 간격 [1,4] 및 [4,5]가 겹치는 것으로 간주됩니다.
```

### Constraints:

- 1 <= intervals.length <= 104
- intervals[i].length == 2
- 0 <= starti <= endi <= 104
