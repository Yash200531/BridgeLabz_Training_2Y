# Java Queue Interface

The `Queue` interface in Java is part of the Java Collections Framework. It follows the **FIFO (First In, First Out)** principle by default. Queue methods are divided into three important pairs based on their functionality.

---

## 1. Core Queue Methods

### A. Insertion Methods
1. **`add()`**
   - Inserts an element into the queue.
   - Returns `true` if insertion is successful.
   - Throws `IllegalStateException` if the queue has no available capacity.
2. **`offer()`**
   - Inserts an element into the queue.
   - Returns `true` if insertion is successful.
   - Returns `false` if the element cannot be inserted due to capacity restrictions.

### B. Removal Methods
3. **`remove()`**
   - Retrieves and removes the front element.
   - Throws `NoSuchElementException` if the queue is empty.
4. **`poll()`**
   - Retrieves and removes the front element.
   - Returns `null` if the queue is empty.

### C. Retrieval Methods
5. **`element()`**
   - Retrieves the front element without removing it.
   - Throws `NoSuchElementException` if the queue is empty.
6. **`peek()`**
   - Retrieves the front element without removing it.
   - Returns `null` if the queue is empty.

---

## 2. Difference Between Queue Methods

| Operation | Exception Method | Special Value Method |
| :--- | :--- | :--- |
| **Insertion** | `add()` | `offer()` |
| **Removal** | `remove()` | `poll()` |
| **Retrieval** | `element()` | `peek()` |

---

## 3. Collection Interface Methods

Since `Queue` extends the `Collection` interface, it also inherits the following methods:

1. `size()` – Returns the total number of elements.
2. `isEmpty()` – Checks whether the queue is empty.
3. `contains()` – Checks whether a particular element exists.
4. `clear()` – Removes all elements from the queue.
5. `toArray()` – Converts queue elements into an array.
6. `iterator()` – Traverses elements in the queue.
7. `remove(Object)` – Removes a specific element from the queue.

---

## 4. Types of Queue Implementations

1. **`PriorityQueue`**
   - Uses a Heap data structure.
   - Arranges elements according to priority.
   - By default, follows Min Heap ordering.
2. **`ArrayDeque`**
   - Uses a resizable circular array.
   - Supports insertion and deletion from both ends.
   - Does not allow `null` elements.
3. **`LinkedList`**
   - Uses a doubly linked list.
   - Supports `Queue` and `Deque` operations.
   - Maintains insertion order when used as a FIFO queue.

---

## 5. Important Points to Remember

- `Queue` follows FIFO by default.
- Insertion generally happens at the rear.
- Removal generally happens from the front.
- `peek()` does not remove an element.
- `poll()` removes an element.
- `PriorityQueue` uses priority-based ordering instead of normal FIFO ordering.
- Most `Queue` implementations do not allow `null` elements.

---

## Example: `PriorityQueue`

```java
package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(15);
        queue.add(20);
        queue.add(10);
        queue.add(2);
        System.out.println(queue);
    }
}
```

**Output:**
```text
[2, 10, 20, 30, 15]
```

---

## Step-by-Step Tree Diagrams

**Code order:** `add(30)`, `add(15)`, `add(20)`, `add(10)`, `add(2)`

### Step 1: `add(30)`
The first element becomes the root.

```text
    30
```

**Array:** `[30]`

### Step 2: `add(15)`
`15` is placed at the next free spot (left child of `30`).

```text
    30
   /
  15
```

Compare with parent: `15 < 30`, so swap.

```text
    15
   /
  30
```

**Array:** `[15, 30]`

### Step 3: `add(20)`
`20` is placed as the right child of the root.

```text
    15
   /  \
  30  20
```

Compare with parent: `20 > 15`, so no swap.

**Array:** `[15, 30, 20]`

### Step 4: `add(10)`
`10` is placed at index 3 (left child of `30`).

```text
      15
     /  \
    30  20
   /
  10
```

Compare with parent `30`: `10 < 30`, so swap.

```text
      15
     /  \
    10  20
   /
  30
```

Compare with parent `15`: `10 < 15`, so swap.

```text
      10
     /  \
    15  20
   /
  30
```

**Array:** `[10, 15, 20, 30]`

### Step 5: `add(2)`
`2` is placed at index 4 (right child of `15`).

```text
      10
     /  \
    15  20
   /  \
  30   2
```

Compare with parent `15`: `2 < 15`, so swap.

```text
      10
     /  \
     2  20
   /  \
  30  15
```

Compare with parent `10`: `2 < 10`, so swap.

```text
       2
     /  \
    10  20
   /  \
  30  15
```

`2` is now the root, so it stops.

**Array:** `[2, 10, 20, 30, 15]`

### Final Tree

```text
       2          index 0
     /  \
    10  20        index 1, 2
   /  \
  30  15          index 3, 4
```

### Summary of Bubble-Ups

| Step | Added | Swaps | Result Array |
| :--- | :--- | :--- | :--- |
| 1 | `30` | 0 | `[30]` |
| 2 | `15` | 1 (with 30) | `[15, 30]` |
| 3 | `20` | 0 | `[15, 30, 20]` |
| 4 | `10` | 2 (with 30, then 15) | `[10, 15, 20, 30]` |
| 5 | `2` | 2 (with 15, then 10) | `[2, 10, 20, 30, 15]` |