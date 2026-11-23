import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            count += map.getOrDefault(n, 0);
            map.merge(n, 1, Integer::sum);
        }
        return count;
    }
}
