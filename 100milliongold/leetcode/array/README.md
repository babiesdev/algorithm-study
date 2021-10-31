# Array

## 1. Two Sum

정수 숫자와 정수 대상의 배열이 주어지면 두 숫자의 인덱스를 반환하여 대상에 더합니다.

각 입력에 정확히 하나의 솔루션이 있다고 가정하고 동일한 요소를 두 번 사용할 수 없습니다.

답변은 어떤 순서로든 반환할 수 있습니다.

 

- Example 1:

    ```
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    ```

- Example 2:

    ```
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    ```

- Example 3:

    ```
    Input: nums = [3,3], target = 6
    Output: [0,1]
    ```

Constraints:
    - `2 <= nums.length <= 104`
    - `-109 <= nums[i] <= 109`
    - `-109 <= target <= 109`
    - `Only one valid answer exists.`




## 121. Best Time to Buy and Sell Stock

배열 가격이 주어지는데, 여기서 가격은 당일 주식의 가격이다.

한 주식을 살 날을 선택하고 해당 주식을 팔 다른 날을 선택하여 이익을 극대화하려고 합니다.

이 거래로 얻을 수 있는 최대 이익을 돌려주세요. 만약 당신이 어떠한 이익도 얻을 수 없다면, 0을 반환하세요.

- Example 1:

    ```
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    설명: 2일차 (price = 1) 에 사고 5일차 (price = 6), profit = 6-1 = 5.
    판매하기 전에 구매해야 하기 때문에 2일째에 구매하고 1일째에 판매하는 것은 허용되지 않습니다.
    ```

- Example 2:

    ```
    Input: prices = [7,6,4,3,1]
    Output: 0
    설명: 이 경우 거래가 수행되지 않으며 최대 profit = 0 입니다.

    ```

- Constraints:
    - `1 <= prices.length <= 105`
    - `0 <= prices[i] <= 104`