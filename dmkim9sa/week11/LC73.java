package leetcode.week11;

import java.util.Arrays;

/**
 * Set Matrix Zeroes
 * Using Algorithm: Depth-First Search
 */
public class LC73 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited; // 방문지점 체크 배열
    static int n;
    static int m;

    public static void main(String[] args) {
        setZeroes(new int[][]{{1, 2, 3, 4}, {5, 0, 7, 8}, {0, 10, 11, 12}, {13, 14, 15, 0}});
    }

    public static void setZeroes(int[][] matrix) {

        m = matrix.length;
        n = matrix[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    dfs(matrix, i, j);
                }
            }
        }

        for (int[] m : matrix) System.out.println(Arrays.toString(m));

    }

    // row: 행, col: 열
    private static void dfs(int[][] matrix, int row, int col) {

        visited[row][col] = true;

        // 행 검색
        for (int i = 0; i < n; i++) {
            if (matrix[row][i] != 0) {
                visited[row][i] = true;
            }
            matrix[row][i] = 0;
        }

        // 열 검색
        for (int i = 0; i < m; i++) {
            if(matrix[i][col] != 0) {
                visited[i][col] = true;
            }
            matrix[i][col] = 0;
        }
    }
}
