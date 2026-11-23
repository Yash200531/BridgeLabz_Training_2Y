class Solution {
    public int findFinalValue(int[] nums, int original) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int n : nums) set.add(n);
        while (set.contains(original)) original *= 2;
        return original;
    }
}
