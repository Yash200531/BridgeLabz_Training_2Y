class Solution {
    public int differenceOfSum(int[] nums) {
        int elemSum = 0, digitSum = 0;
        for (int n : nums) {
            elemSum += n;
            int tmp = n;
            while (tmp > 0) { digitSum += tmp % 10; tmp /= 10; }
        }
        return Math.abs(elemSum - digitSum);
    }
}
