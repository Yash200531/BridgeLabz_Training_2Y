import java.util.Arrays;

public class MergeSort {

    /*
     * TIME COMPLEXITY  — TC-3
     * -------------------------------------------------
     * Division tree for {8, 61, 2, 3, 4, 0}:
     *
     *              [8, 61, 2, 3, 4, 0]           Level 0 — 1 array of size 6
     *               /                \
     *         [8, 61, 2]         [3, 4, 0]        Level 1 — size 3, 3
     *          /      \           /      \
     *      [8, 61]    [2]      [3, 4]    [0]      Level 2 — size 2, 1, 2, 1
     *       /    \              /    \
     *     [8]   [61]          [3]   [4]           Level 3 — single elements
     *
     * Recurrence: T(N) = 2T(N/2) + O(N)
     *
     *   Level 0: 1 subproblem  × size N    → work = cN
     *   Level 1: 2 subproblems × size N/2  → work = cN
     *   Level 2: 4 subproblems × size N/4  → work = cN
     *   ...
     *   Level k: 2^k subproblems × N/2^k   → work = cN
     *
     *   Height = log₂(N)  →  total levels = log₂(N) + 1
     *   Total work = cN × (log₂(N) + 1)
     *
     *   Time Complexity = O(N log N)  — Best, Average, and Worst Case.
     *
     * SPACE COMPLEXITY — SC-3
     * -------------------------------------------------
     * Auxiliary Space O(N):
     *   The merge step allocates leftArr and rightArr (total N elements across
     *   all active merge calls). Recursion stack depth = O(log N).
     *   Dominant term: O(N) + O(log N) = O(N).
     *
     * Comparison with in-place sorts:
     *   Insertion Sort : O(1)      auxiliary — in-place shifts, O(N²) time.
     *   Quick Sort     : O(log N)  average stack space, O(1) heap — faster in practice.
     *   Merge Sort     : O(N)      auxiliary — higher memory, but stable and O(N log N) guaranteed.
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr  = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i]  = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
            else                           arr[k++] = rightArr[j++];
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {8, 61, 2, 3, 4, 0};
        System.out.println("Before: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}
