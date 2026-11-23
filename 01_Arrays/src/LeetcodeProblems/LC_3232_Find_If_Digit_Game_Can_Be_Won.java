class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0, doubleDigit = 0;
        for (int n : nums) {
            if (n < 10) single += n;
            else doubleDigit += n;
        }
        return single != doubleDigit;
    }
}
