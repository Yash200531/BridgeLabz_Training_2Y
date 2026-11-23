public class BinarySearch {

    /*
     * TIME COMPLEXITY  — TC-2
     * -------------------------------------------------
     * Step-by-step trace on {0, 2, 3, 4, 8, 61}, target = 4:
     *
     *   Iteration 1: low=0, high=5  mid=2  arr[2]=3  → 3 < 4  → low = 3
     *   Iteration 2: low=3, high=5  mid=4  arr[4]=8  → 8 > 4  → high = 3
     *   Iteration 3: low=3, high=3  mid=3  arr[3]=4  → MATCH  → return 3
     *
     * Mathematical derivation:
     *   Each step halves the search space:
     *     Step 0 → N elements
     *     Step 1 → N/2
     *     Step k → N/2^k
     *   Stops when N/2^k = 1  =>  k = log₂(N)
     *   Max comparisons = floor(log₂(N)) + 1
     *   Worst-Case Time Complexity = O(log N)
     *
     * SPACE COMPLEXITY — SC-2
     * -------------------------------------------------
     * Auxiliary Space O(1):
     *   Only three pointer variables (low, high, mid) are maintained.
     *   No extra arrays; no recursive call stack.
     *   (Recursive Binary Search would cost O(log N) stack space.)
     */
    public static int binarySearch(int[] sortedArr, int target) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArr[mid] == target) {
                return mid;
            } else if (sortedArr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sorted = {0, 2, 3, 4, 8, 61};

        System.out.println("Sorted Array: {0, 2, 3, 4, 8, 61}");
        System.out.println("Search target=4  -> index " + binarySearch(sorted, 4));
        System.out.println("Search target=0  -> index " + binarySearch(sorted, 0));
        System.out.println("Search target=61 -> index " + binarySearch(sorted, 61));
        System.out.println("Search target=5  -> index " + binarySearch(sorted, 5));
    }
}
