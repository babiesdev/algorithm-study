class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        board = [[0]*n for _ in range(m)] # n 가로, m 세로
        
        for i in range(m):
            for j in range(n):
                if i == 0 or j == 0:
                    board[i][j] = 1
                else:
                    board[i][j] = board[i][j-1] + board[i-1][j]
                
        return board[-1][-1]