package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers
        .filter { item -> item >= 1 && item % divider == 0}
        .toIntArray()
}
