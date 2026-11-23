import java.util.*;
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String w : words1) map1.merge(w, 1, Integer::sum);
        for (String w : words2) map2.merge(w, 1, Integer::sum);
        int count = 0;
        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if (e.getValue() == 1 && map2.getOrDefault(e.getKey(), 0) == 1) count++;
        }
        return count;
    }
}
