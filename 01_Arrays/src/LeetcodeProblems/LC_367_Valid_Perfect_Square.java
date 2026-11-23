class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) left = (int) mid + 1;
            else right = (int) mid - 1;
        }
        return false;
    }
}
