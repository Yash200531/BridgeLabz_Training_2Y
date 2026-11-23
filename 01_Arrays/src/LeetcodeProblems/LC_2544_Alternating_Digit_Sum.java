class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0, sign = 1;
        for (char c : s.toCharArray()) {
            sum += sign * (c - '0');
            sign = -sign;
        }
        return sum;
    }
}
