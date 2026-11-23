# HashMap & HashSet - Comprehensive Notes & Techniques

## 1. Core Concepts
- Uses `hashCode()` and `equals()` to map keys to buckets for average **O(1)** `put`, `get`, `remove`, and `contains`.
- `HashSet` stores unique elements; `HashMap` maps keys to values; `LinkedHashMap` preserves insertion order.

## 2. Essential Techniques
- **Frequency Counting:** `map.put(k, map.getOrDefault(k, 0) + 1)` for numbers, characters, or words.
- **Membership / Seen Tracking:** Fast duplicate detection, union/intersection of two collections.
- **Complement / Target Lookup:** Checking if `target - current` has already been seen.
- **Grouping by Signature:** Grouping items that share a normalized key.

## 3. Common Pitfalls
- Mutating an object after inserting it as a key into a `HashMap`/`HashSet`.
- Assuming iteration order in `HashMap` or `HashSet` is sorted or insertion-ordered.
