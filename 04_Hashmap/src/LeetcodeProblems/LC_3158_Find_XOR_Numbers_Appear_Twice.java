import java.util.*;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) count.merge(n, 1, Integer::sum);
        int xor = 0;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() == 2) xor ^= e.getKey();
        }
        return xor;
    }
}
