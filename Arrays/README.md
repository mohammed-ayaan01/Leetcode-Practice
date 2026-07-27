# 🔢 Arrays

Notes, patterns, and solved problems for the Arrays topic. Updated as I go.

---

## 📖 Core Concept

An array stores elements in contiguous memory, indexed from `0` to `n-1`. Because of contiguous storage, arrays give **O(1) random access** by index, but **O(n) insertion/deletion** in the middle (everything after has to shift).

Most array problems boil down to: *can I avoid a brute-force O(n²) scan by using extra space, sorting, or a smarter pointer strategy?*

---

## 🧩 Key Patterns

| Pattern | When to use it | Typical time complexity |
|---|---|---|
| **Two Pointers** | Sorted array, looking for a pair/triplet, or comparing from both ends | O(n) |
| **Sliding Window** | Contiguous subarray with a size/sum/condition constraint | O(n) |
| **Prefix Sum** | Repeated range-sum queries, or "subarray sums to X" problems | O(n) preprocessing, O(1) per query |
| **Kadane's Algorithm** | Maximum subarray sum (contiguous) | O(n) |
| **Sorting first** | When order doesn't matter but relationships between values do | O(n log n) |
| **Hashing (Set/Map)** | Fast lookups, detecting duplicates, complements (e.g. Two Sum) | O(n) time, O(n) space |

---

## ⏱️ Complexity Cheat Sheet

| Operation | Time Complexity |
|---|---|
| Access by index | O(1) |
| Search (unsorted) | O(n) |
| Search (sorted, binary search) | O(log n) |
| Insert/Delete at end | O(1) amortized |
| Insert/Delete at start/middle | O(n) |
---

## 💡 Notes & Gotchas

- Watch for off-by-one errors on boundary conditions (`<` vs `<=`).
- Sorting a copy first (`Arrays.sort()` / `sorted()`) can simplify a problem but costs O(n log n) — check if that's acceptable before defaulting to it.
- When in doubt about extra space, ask: can a Hash Set/Map turn an O(n²) brute force into O(n)?