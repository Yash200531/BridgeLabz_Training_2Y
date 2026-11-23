public class LinearSearch {

    /*
     * TIME COMPLEXITY  — TC-1
     * -------------------------------------------------
     * Best Case  O(1):  Target is at index 0.
     *                   Only 1 comparison is made regardless of N.
     *
     * Worst Case O(N):  Target is at the last index OR not present.
     *                   All N elements are compared (e.g. N=6 → 6 comparisons).
     *
     * Average    O(N):  Target equally likely at any position.
     *                   Expected comparisons = (1+2+...+N)/N = (N+1)/2 → O(N).
     *
     * SPACE COMPLEXITY — SC-1
     * -------------------------------------------------
     * Auxiliary Space O(1):
     *   Only a constant number of scalar variables (i, target) are used.
     *   No extra arrays or recursion stack are allocated.
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sample = {8, 61, 2, 3, 4, 0};

        System.out.println("Array: {8, 61, 2, 3, 4, 0}");
        System.out.println("Search target=8  (Best Case)  -> index " + linearSearch(sample, 8));
        System.out.println("Search target=0  (Worst Case) -> index " + linearSearch(sample, 0));
        System.out.println("Search target=99 (Not Found)  -> index " + linearSearch(sample, 99));
    }
}
