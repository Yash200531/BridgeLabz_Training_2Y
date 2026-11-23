class Solution {
    public int longestContinuousSubstring(String s) {
        int max = 1, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) { cur++; max = Math.max(max, cur); }
            else cur = 1;
        }
        return max;
    }
}
