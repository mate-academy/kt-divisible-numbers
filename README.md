# Divisible Numbers

You'll create a new array with element values that are all divisible by the specified number.

We declared the `getDivisibleNumbers()` function that accepts two parameters: `numbers: IntArray` and `divider: Int`.

**Your task:** Implement the function to return an array with only positive numbers that are evenly divisible by `divider`. 
Take into account, that order of positive numbers that are evenly divisible by `divider` in the returned array must be the same as it was in the original array.


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
