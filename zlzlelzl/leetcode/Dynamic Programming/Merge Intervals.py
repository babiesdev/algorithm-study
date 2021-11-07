class Node:
    def __init__(self, data, right=None):
        self.data = data
        self.right = right

    def __str__(self):
        return str(self.data)


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # 2차원 배열을 만들어서 배열의 연결을 확인

        li = [None] * int(10e4+1)

        for interval in intervals:
            for i in range(interval[0], interval[1] + 1):
                if not li[i]:  # 중복 선언 막기
                    li[i] = Node(i)

                if i != interval[0]:  # 리스트 연결
                    li[i-1].right = li[i]

        answer = []

        idx = 0
        while idx <= int(10e4):
            if li[idx]:
                s = idx
                while True:
                    if not li[idx].right:
                        break

                    idx += 1

                e = idx

                answer.append([s, e])

            idx += 1

        return answer
