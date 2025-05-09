package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val toTypedArray = numbers.filter { it >= 0 && it % divider == 0 }.toIntArray()

    return toTypedArray
}

