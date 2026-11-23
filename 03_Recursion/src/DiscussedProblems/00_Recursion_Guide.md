# Recursion - Comprehensive Notes & Techniques

## 1. Core Concepts
- Every recursive function needs:
  1. **Base Case(s):** Stops recursion so the call stack unwinds.
  2. **Recursive Case:** Moves state toward the base case.
- **Time & Space Complexity:** Time depends on branches and calls; space is at least **O(depth)** for the call stack.

## 2. Essential Techniques
- **Linear Recursion (Head / Tail):** Printing `1..N` or `N..1`, sum of `1..N`, factorial, array sum.
- **Array / String Index Recursion:** Checking sortedness, palindrome, searching, reversing via index `idx`.
- **Branching Recursion & Fast Exponentiation:** Fibonacci/Tribonacci, binary exponentiation `pow(x, n)`.

## 3. Common Pitfalls
- Missing or unreachable base case causing `StackOverflowError`.
- Recomputing overlapping subproblems without memoization or iteration.
