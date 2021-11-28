import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, -1, pacific);
            dfs(heights, i, (n - 1), -1, atlantic);
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, 0, j, -1, pacific);
            dfs(heights, (m - 1), j, -1, atlantic);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public void dfs(int[][] heights, int i, int j, int prev, boolean[][] reachable) {
        if (i < 0 || j < 0 || i >= heights.length || j >= heights[0].length) {
            return;
        }
        if (reachable[i][j] || heights[i][j] < prev) {
            return;
        }
        reachable[i][j] = true;

        dfs(heights, (i + 1), j, heights[i][j], reachable);
        dfs(heights, (i - 1), j, heights[i][j], reachable);
        dfs(heights, i, (j + 1), heights[i][j], reachable);
        dfs(heights, i, (j - 1), heights[i][j], reachable);
    }
}