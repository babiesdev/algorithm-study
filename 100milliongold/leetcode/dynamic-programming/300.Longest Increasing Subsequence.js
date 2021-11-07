/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    // dp 배열 생성
    const dp = new Array(nums.length).fill(1);
    // 최대 하위 시퀀스 길이
    let max = 1
    // 현재 i번째 숫자까지 증가하는 모든 하위 시퀀스를 nums 단위로 확인합니다.
    for (let i = 1; i < nums.length; i++) {
        // dp 배열의 하위 시퀀스 길이를 추적합니다.
        for (let j = 0; j < i; j++) {
            // 숫자가 증가하는 경우에만 dp 값을 변경합니다.
            if (nums[i] > nums[j]) {
                // 값을 가장 큰 부분 시퀀스 길이로 설정
                dp[i] = Math.max(dp[i], dp[j] + 1)
                // 이 하위 시퀀스가 가장 큰지 확인
                max = Math.max(dp[i], max)
            }
        }
    }
    return max;
};