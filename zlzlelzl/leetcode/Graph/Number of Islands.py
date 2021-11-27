class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(x, y):
            if not (0 <= x < len(grid) and 0 <= y < len(grid[0])):
                return 0

            if grid[x][y] == "0":
                return 0

            grid[x][y] = "0"

            dfs(x-1, y)
            dfs(x+1, y)
            dfs(x, y-1)
            dfs(x, y+1)

            return 1

        answer = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                answer += dfs(i, j)

        return answer
