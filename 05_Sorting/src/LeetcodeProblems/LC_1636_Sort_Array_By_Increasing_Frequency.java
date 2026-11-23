import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);
        Integer[] boxed = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) boxed[i] = nums[i];
        Arrays.sort(boxed, (a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            return fa != fb ? fa - fb : b - a;
        });
        for (int i = 0; i < nums.length; i++) nums[i] = boxed[i];
        return nums;
    }
}
