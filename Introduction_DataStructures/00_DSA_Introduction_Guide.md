# Introduction to Data Structures and Algorithms

## 1. What is DSA?
- **Data Structure:** A way of organizing and storing data so it can be accessed and modified efficiently.
- **Algorithm:** A finite sequence of well-defined steps to solve a problem.
- Together they form the foundation of software engineering — every program you write implicitly uses both.

## 2. Algorithm Analysis

### Time Complexity
Measures how the number of operations grows as input size **N** increases.

| Complexity | Name | Example |
|---|---|---|
| O(1) | Constant | Array index access |
| O(log N) | Logarithmic | Binary Search |
| O(N) | Linear | Linear Search |
| O(N log N) | Linearithmic | Merge Sort |
| O(N²) | Quadratic | Bubble / Insertion Sort (worst) |

### Space Complexity
Measures how much **extra (auxiliary)** memory an algorithm needs beyond its input.

| Algorithm | Time | Auxiliary Space |
|---|---|---|
| Linear Search (iterative) | O(N) worst | O(1) |
| Binary Search (iterative) | O(log N) | O(1) |
| Merge Sort | O(N log N) | O(N) |
| Quick Sort | O(N log N) avg | O(log N) stack |
| Insertion Sort | O(N²) worst | O(1) |

## 3. Pseudocode Conventions Used
- `SET x = value` — variable assignment
- `IF ... THEN ... ELSE ... END IF` — conditional
- `WHILE ... DO ... END WHILE` — loop
- `MOD` — modulo (remainder), `DIV` — integer division
- `BREAK` — exit the current loop immediately
- `PRINT` — produce output

## 4. Flowchart Shape Conventions
| Shape | Meaning |
|---|---|
| Oval / Terminal | START or END |
| Parallelogram | Input / Output |
| Rectangle / Process | Computation step |
| Diamond / Decision | Yes/No branch |
| Arrow | Control flow direction |

## 5. Files in This Module

| File | Contents |
|---|---|
| `00_DSA_Introduction_Guide.md` | This guide |
| `Pseudocode_and_Flowcharts.md` | PC-1 (Prime Checker) and PC-2 (Digit Reversal) pseudocode + FC-1 and FC-2 flowcharts |
| `LinearSearch.java` | TC-1 / SC-1 — iterative linear search with complexity notes |
| `BinarySearch.java` | TC-2 / SC-2 — iterative binary search with step-by-step trace |
| `MergeSort.java` | TC-3 / SC-3 — merge sort with recursion tree explanation |
