from collections import deque


class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        r, c = len(heights), len(heights[0])

        board = {"pacific": [[0] * c for __ in range(r)],
                 "atlantic": [[0] * c for __ in range(r)]}

        dx = [0, 0, -1, 1]
        dy = [-1, 1, 0, 0]

        # def dfs(x, y, ocean_type):
        #     if visited[x][y]:
        #         return

        #     board[ocean_type][x][y] = 1
        #     visited[x][y] = 1

        #     for i in range(4):
        #         nx = x + dx[i]
        #         ny = y + dy[i]

        #         if 0 <= nx < r and 0 <= ny < c:
        #             if not visited[nx][ny]:
        #                 if heights[x][y] <= heights[nx][ny]:
        #                     dfs(nx, ny, ocean_type)

        def bfs(x, y, ocean_type):
            q = deque()
            q.append([x, y])

            if visited[x][y]:
                return

            while q:
                x, y = q.popleft()

                board[ocean_type][x][y] = 1
                visited[x][y] = 1

                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]

                    if 0 <= nx < r and 0 <= ny < c:
                        if not visited[nx][ny]:
                            if heights[x][y] <= heights[nx][ny]:
                                q.append([nx, ny])
                                visited[nx][ny] = 1

        visited = [[0] * c for __ in range(r)]
        for i in range(r):
            bfs(i, 0, "pacific")
        for i in range(c):
            bfs(0, i, "pacific")

        visited = [[0] * c for __ in range(r)]
        for i in range(r):
            bfs(i, c-1, "atlantic")
        for i in range(c):
            bfs(r-1, i, "atlantic")

        li = []

        for i in range(r):
            for j in range(c):
                if board["pacific"][i][j] == 1 and board["atlantic"][i][j] == 1:
                    li.append([i, j])

        return li
