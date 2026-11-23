# Arrays - Comprehensive Notes & Techniques

## 1. Core Concepts
- Contiguous memory allocation; direct index access in **O(1)** time.
- Array length is fixed at creation; insertion/deletion in the middle shifts elements in **O(n)** time.

## 2. Essential Techniques
- **Linear Scan / Traversal:** Min/max, sum/average, second largest, running counts.
- **Two Pointers (Opposite / Same Direction):** In-place reversal, partitioning evens/odds, removing duplicates/zeroes, sorted pair checks.
- **Prefix Sum & Suffix / Running State:** Fast range sum queries, equilibrium/balance points, running bests.
- **Sliding Window (Fixed & Variable):** Contiguous subarray sums, averages, max/min window metrics.
- **Binary Search on Sorted / Monotonic Arrays:** Classic search, first/last occurrence, lower/upper bound, answer search.

## 3. Common Pitfalls
- `ArrayIndexOutOfBoundsException` when loop bounds use `<= arr.length - 1` vs `<= arr.length`.
- `int` overflow when summing or multiplying large array values (use `long`).
