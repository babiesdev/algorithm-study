class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        text1 = "-" + text1
        text2 = "-" + text2
        board = [[0] * len(text1) for _ in range(len(text2))]

        for j in range(1, len(text1)):
            for i in range(1, len(text2)):
                if text1[j] == text2[i]:
                    board[i][j] = board[i-1][j-1] + 1
                else:
                    board[i][j] = max(board[i][j-1], board[i-1][j])

        return board[-1][-1]
