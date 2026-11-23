class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 != 0) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right--] = tmp;
            } else left++;
        }
        return nums;
    }
}
