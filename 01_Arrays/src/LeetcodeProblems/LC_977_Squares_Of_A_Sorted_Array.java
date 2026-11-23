class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int l2 = nums[left] * nums[left], r2 = nums[right] * nums[right];
            if (l2 > r2) { result[pos--] = l2; left++; }
            else { result[pos--] = r2; right--; }
        }
        return result;
    }
}
