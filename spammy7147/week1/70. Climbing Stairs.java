import java.util.ArrayList;
import java.util.List;

class Solution70 {
    public int climbStairs(int n) {
        List<Integer> steps = new ArrayList<>();
        steps.add(1);
        steps.add(2);

        for(int i = 2; i < n; i++){
            steps.add(steps.get(i-2)+steps.get(i-1));
        }
        return steps.get(n-1);
    }
}




class Main70 {
    public static void main(String[] args) {
        System.out.println(new Solution70().climbStairs(5));
    }
}