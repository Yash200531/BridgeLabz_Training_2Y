# Linked List - Comprehensive Notes & Techniques

## 1. Core Concepts
- Nodes hold data and a reference/pointer to the `next` node (and `prev` in doubly linked lists).
- Dynamic size with **O(1)** insertion/deletion once the node/position is located, but **O(n)** traversal by index.

## 2. Essential Techniques
- **Traversal, Length & Search:** Walk with `curr = head` until `curr == null`.
- **Insertion & Deletion (with Dummy Head):** Handle head/tail/middle edge cases cleanly using a sentinel `dummy` node.
- **Pointer Reversal:** Iterative 3-pointer (`prev`, `curr`, `next`) or recursive reversal.
- **Fast & Slow Pointers (Tortoise & Hare):** Find middle node, detect cycles (Floyd's algorithm), find nth from end.
- **Sorted List Merging:** Compare heads of two sorted lists using a dummy tail pointer.

## 3. Common Pitfalls
- Dereferencing `curr.next` when `curr` is `null` (`NullPointerException`).
- Overwriting `curr.next` before saving `Node next = curr.next` during reversal/deletion.
