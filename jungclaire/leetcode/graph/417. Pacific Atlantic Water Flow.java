import java.util.ArrayList;
import java.util.List;

class Solution417 {
    static int[][] direct = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> answer = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pac = new boolean[heights.length][heights[0].length];
        boolean[][] atl = new boolean[heights.length][heights[0].length];

        for (int i = 0; i < n; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pac);
            dfs(heights, m - 1, i, Integer.MIN_VALUE, atl);
        }
        for (int j = 0; j < m; j++) {
            dfs(heights, j, 0, Integer.MIN_VALUE, pac);
            dfs(heights, j, n - 1, Integer.MIN_VALUE, atl);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pac[i][j] && atl[i][j]) {
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    answer.add(l);
                }
            }
        }
        return answer;
    }

    public static void dfs(int[][] heights, int i, int j, int prev, boolean[][] array) {
        if (i < 0 || j < 0 || i >= heights.length || j >= heights[0].length || array[i][j] || heights[i][j] < prev)
            return;

        array[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int x = i + direct[k][0];
            int y = j + direct[k][1];

            dfs(heights, x, y, heights[i][j], array);
        }
    }
}