class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    mark(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void mark(char[][] grid, int row, int col) {
        grid[row][col] = '@';
        if(row < grid.length - 1 && grid[row+1][col] == '1'){
            mark(grid, row+1, col);
        }
        if(row > 0 && grid[row-1][col] == '1'){
            mark(grid, row-1, col);
        }
        if(col > 0 && grid[row][col-1] == '1'){
            mark(grid, row, col-1);
        }
        if(col < grid[row].length - 1 && grid[row][col+1] == '1'){
            mark(grid, row, col+1);
        }
    }
}