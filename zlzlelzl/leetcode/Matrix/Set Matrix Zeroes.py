class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        def find_zeros():
            pos_zeros = []
            for i in range(len(matrix[0])):
                for j in range(len(matrix)):
                    if matrix[j][i] == 0:
                        pos_zeros.append([i, j])
            return pos_zeros

        def cross_direction_ahead(x, y):
            for i in range(len(matrix[0])):
                matrix[y][i] = 0

            for j in range(len(matrix)):
                matrix[j][x] = 0

        pos_zeros = find_zeros()

        for pos_zero in pos_zeros:
            x, y = pos_zero
            cross_direction_ahead(x, y)
