import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) order.put(arr2[i], i);
        Integer[] boxed = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) boxed[i] = arr1[i];
        Arrays.sort(boxed, (a, b) -> {
            boolean aIn = order.containsKey(a), bIn = order.containsKey(b);
            if (aIn && bIn) return order.get(a) - order.get(b);
            if (aIn) return -1;
            if (bIn) return 1;
            return a - b;
        });
        for (int i = 0; i < arr1.length; i++) arr1[i] = boxed[i];
        return arr1;
    }
}
