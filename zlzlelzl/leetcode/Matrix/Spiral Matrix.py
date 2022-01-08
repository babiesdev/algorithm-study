class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:        
        dx = [1,0,-1,0]
        dy = [0,1,0,-1]
        
        x,y = 0, 0
        di = 0
        
        li = []
        li.append(matrix[0][0])
        matrix[0][0] = -101
        
        i = 1
        
        while i < len(matrix)*len(matrix[0]):
            if 0 <= x + dx[di] < len(matrix[0]) and 0 <= y + dy[di] < len(matrix):
                nx = x + dx[di]
                ny = y + dy[di]
                if matrix[ny][nx] != -101:
                    x = nx
                    y = ny
                    li.append(matrix[y][x])
                    matrix[y][x] = -101
                    i += 1
                else:
                    di = (di + 1) % 4
            else:
                di = (di + 1) % 4
                
        return li