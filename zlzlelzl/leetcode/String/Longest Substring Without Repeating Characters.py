from collections import deque


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # 한글자라도 반복되면 최대값 갱신하고 반복되는 위치까지 삭제
        # 리셋까지의 문자를 저장, 큐를 사용하여 O(1)으로 만듦
        # 매번 최대 문자열 길이와 비교

        q = deque()
        max_length = 0

        for c in s:
            if c in q:
                while c in q:
                    q.popleft()

            q.append(c)

            max_length = max(max_length, len(q))

        return max_length
