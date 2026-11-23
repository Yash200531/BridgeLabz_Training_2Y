# Stack - Comprehensive Notes & Techniques

## 1. Core Concepts
- **LIFO (Last-In, First-Out):** Most recently added element is removed first.
- Core operations: `push`, `pop`, `peek`/`top`, `isEmpty`, `size` — all **O(1)**.
- In Java, use `ArrayDeque<Integer>` or `ArrayDeque<Character>` instead of synchronized legacy `Stack`.

## 2. Essential Techniques
- **Matching & Nesting:** Balanced parentheses/brackets, removing adjacent duplicates/stars.
- **Reversal & History/Undo:** Reversing sequences, simulating back/undo steps.
- **Monotonic Stack:** Maintaining increasing or decreasing values to find next greater/smaller elements in **O(n)**.

## 3. Common Pitfalls
- Calling `pop()` or `peek()` on an empty stack without checking `isEmpty()`.
- Forgetting to check if the stack still has unmatched opening items at the end of a scan.
