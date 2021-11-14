import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canFinish(5, new int[][] { { 1, 2 } }));
    }
}

class Solution {
    Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
    int[] deg;

    boolean bfs() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < deg.length; i++) {
            if (deg[i] == 0) {
                q.add(i);
            }
        }
        while (q.isEmpty() == false) {
            int curr = q.poll();
            ArrayList<Integer> children = adj.get(curr);
            if (children != null) {
                for (int child : children) {
                    deg[child]--;
                    if (deg[child] == 0)
                        q.add(child);
                }
            }

        }
        for (int i = 0; i < deg.length; i++) {
            if (deg[i] != 0)
                return false;
        }
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        deg = new int[numCourses];
        for (int i = 0; i < n; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            if (!adj.containsKey(b)) {
                adj.put(b, new ArrayList<Integer>());
            }
            adj.get(b).add(a);
            deg[a]++;
        }
        return bfs();

    }
}