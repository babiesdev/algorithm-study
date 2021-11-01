var merge = function(intervals) {
    if(intervals.length <= 1) return intervals;
    // 더 이른 시작 시간이 처음에 오도록 배열을 정렬합니다.
    intervals = intervals.sort((a,b) => a[0] - b[0])
    let output = [intervals[0]];
    let current = output[0];
    // If the current interval's end time is greater than or equal
    // 다음 간격의 시작 시간으로 이동하면 다음 간격이 있음을 알 수 있습니다.
    // 겹치고 병합합니다.
    // 겹침이 없으면 다음 간격을 추가합니다.
    // 출력 배열의 간격 목록을 만들고 프로세스를 반복합니다.
    // 전체 구간 목록을 살펴볼 때까지.
    for(let i = 1; i< intervals.length;i++) {
        const next = intervals[i]
        if(current[1] >= next[0]) {
            current[1] = Math.max(current[1], next[1]);
        } else {
            current = next;
            output.push(current);
        }
    }
    return output;
};
