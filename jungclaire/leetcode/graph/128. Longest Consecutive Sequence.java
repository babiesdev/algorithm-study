import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int max = 0;
        for (int num : nums) {
            if (!set.contains(num))
                continue;
            set.remove(num);
            int prev = num - 1, large = num + 1;
            while (set.contains(prev)) {
                set.remove(prev);
                prev--;
            }
            while (set.contains(large)) {
                set.remove(large);
                large++;
            }
            max = Math.max(max, large - prev - 1);
        }
        return max;
    }
}