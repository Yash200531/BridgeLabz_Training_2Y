class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int n : nums) count[n]++;
        int dup = -1, missing = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) dup = i;
            if (count[i] == 0) missing = i;
        }
        return new int[]{dup, missing};
    }
}
