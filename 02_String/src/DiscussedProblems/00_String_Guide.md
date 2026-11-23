# Strings - Comprehensive Notes & Techniques

## 1. Core Concepts
- `String` in Java is immutable and backed by characters/bytes; every concatenation creates a new object.
- Use `StringBuilder` for building or editing strings inside loops (**O(n)** amortized vs **O(n²)** string concatenation).

## 2. Essential Techniques
- **Character Classification & ASCII Math:** Digits `'0'-'9'`, uppercase `'A'-'Z'`, lowercase `'a'-'z'`, case conversion `+ 32` / `- 32` or `Character` methods.
- **Two Pointers:** Palindrome checks, reversing characters/vowels/words, comparing strings with skips.
- **Frequency Arrays (`int[26]` / `int[128]`):** Anagrams, pangrams, first unique character, character counts.
- **Sliding Window on Strings:** Longest substring without repeating characters, fixed-length vowel/block windows.

## 3. Common Pitfalls
- Using `==` instead of `.equals()` for content comparison.
- Indexing past `str.length() - 1` or forgetting `null`/empty string checks.
