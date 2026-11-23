import java.util.*;
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        List<Integer> result = new ArrayList<>();
        for (int num = 100; num <= 998; num += 2) {
            int[] used = new int[10];
            int tmp = num;
            while (tmp > 0) { used[tmp % 10]++; tmp /= 10; }
            boolean valid = true;
            for (int i = 0; i < 10; i++) if (used[i] > freq[i]) { valid = false; break; }
            if (valid) result.add(num);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
