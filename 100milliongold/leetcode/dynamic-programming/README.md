# Dynamic Programming

---
## Climbing Stairs

피보나치 수열이므로 재귀호출을 하되 , 실행시간도 검사하므로 꼬리재귀를 사용하여 해결

---
## Coin Change

### 문제설명

---
## Longest Increasing Subsequence

### 문제설명

정수 배열 num이 지정되면 가장 긴 순위의 길이를 반환합니다.

하위 시퀀스는 나머지 요소의 순서를 변경하지 않고 일부 또는 전혀 요소를 삭제하여 배열에서 파생될 수 있는 시퀀스입니다. 예를 들어, `[3,6,2,7]`은 배열 `[0,3,1,6,2,2,7]` 의 후속입니다.

 

Example 1:

```
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
```

Example 2:

```
Input: nums = [0,1,0,3,2,3]
Output: 4
```

Example 3:

```
Input: nums = [7,7,7,7,7,7,7]
Output: 1
 ```

Constraints:

- `1 <= nums.length <= 2500`
- `-104 <= nums[i] <= 104`

### 풀이


비교하면서 계산