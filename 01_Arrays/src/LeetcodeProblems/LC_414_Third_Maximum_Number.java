class Solution {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;
        for (int n : nums) {
            long v = n;
            if (v == first || v == second || v == third) continue;
            if (first == null || v > first) { third = second; second = first; first = v; }
            else if (second == null || v > second) { third = second; second = v; }
            else if (third == null || v > third) { third = v; }
        }
        return third == null ? (int)(long)first : (int)(long)third;
    }
}
