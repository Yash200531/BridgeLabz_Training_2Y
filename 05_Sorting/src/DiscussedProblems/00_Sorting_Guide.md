# Sorting - Comprehensive Notes, Algorithms & Techniques

## 1. Core Sorting Algorithms
- **Bubble Sort:** Repeatedly swaps adjacent out-of-order elements; **O(n²)** worst/avg, **O(n)** best with early-exit flag, stable.
- **Selection Sort:** Selects minimum from unsorted suffix and swaps to front; **O(n²)** comparisons, fewer swaps, unstable.
- **Insertion Sort:** Builds sorted prefix by shifting elements right; **O(n²)** worst/avg, **O(n)** nearly sorted, stable, great for small/online inputs.
- **Merge Sort:** Divide-and-conquer split + ordered merge; **O(n log n)** always, **O(n)** auxiliary space, stable.
- **Quick Sort:** Partitions around pivot and recurses; **O(n log n)** average, **O(n²)** worst, **O(log n)** stack space, typically unstable.

## 2. Java Sorting & Problem Techniques
- `Arrays.sort(int[])` uses Dual-Pivot Quicksort; `Arrays.sort(T[], Comparator)` uses TimSort (stable, **O(n log n)**).
- Common uses: Custom comparators, Dutch National Flag partitioning, kth order selection, merging sorted ranges.
