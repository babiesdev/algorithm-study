from collections import deque


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        g = [[] for _ in range(numCourses)]

        # indegree 배열설정, 그래프 만들때 같이만듬
        # indegree가 0인 것을 큐에 넣음
        # 큐에서 pop하면서 result배열에 넣고 그래프에 돌리면서 배열의 값을 -1
        # 계산된 값이 0이면 다시 큐에 넣음
        # 초기조건으로 자기자신을 가리키는 경우 사이클이므로 False를 리턴

        q = deque()
        indegree = [0] * numCourses

        for prerequisite in prerequisites:
            a, b = prerequisite

            if a == b:
                return False

            g[a].append(b)
            indegree[b] += 1

        for i in range(numCourses):
            if indegree[i] == 0:
                q.append(i)

        result = []

        while q:
            now = q.popleft()
            result.append(now)

            for v in g[now]:
                indegree[v] -= 1

                if indegree[v] == 0:
                    q.append(v)

        return len(result) == numCourses
