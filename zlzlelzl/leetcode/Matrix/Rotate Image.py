class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        matrix[:] = [[x[i] for x in matrix[::-1]] for i in range(len(matrix))]