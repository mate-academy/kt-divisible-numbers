# Divisible Numbers

We declared the `getDivisibleNumbers()` function that accepts two parameters: `numbers: IntArray` and `divider: Int`.

**Your task:** implement a function to return an array with only positive numbers evenly divisible by the `divider`. Consider that the order of positive numbers evenly divisible by `divider` in the returned array must be the same as in the original array.

For example, with the following input:

```kotlin
val numbers = intArrayOf(2, 5, 8, 0, 7, 1, -4)
val divider = 2
```

The result is:

```kotlin
val result = intArrayOf(2, 8)
// only 2 and 8 are positive and divisible by 2 without remainder
```
