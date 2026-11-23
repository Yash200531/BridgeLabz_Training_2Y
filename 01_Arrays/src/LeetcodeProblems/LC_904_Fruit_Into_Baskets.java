import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, max = 0;
        for (int right = 0; right < fruits.length; right++) {
            basket.merge(fruits[right], 1, Integer::sum);
            while (basket.size() > 2) {
                basket.merge(fruits[left], -1, Integer::sum);
                if (basket.get(fruits[left]) == 0) basket.remove(fruits[left]);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
