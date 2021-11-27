from collections import deque, defaultdict


class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:

        _dict = defaultdict(list)

        for i in range(len(s)):
            for j in range(i, len(s)):
                if s[i:j+1] in wordDict:
                    _dict[i].append(j+1)

        def bfs():
            q = deque()
            q.append(0)

            while q:
                now = q.popleft()

                if now == len(s):
                    return True

                for idx in _dict[now]:
                    if idx not in q:
                        q.append(idx)

            return False

        return(bfs())
