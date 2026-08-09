package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val result: MutableList<Int> = mutableListOf()
        numbers.forEach {
        a -> if (a > 0 && a % divider == 0) result.add(a)
    }
    return result.toIntArray()
}
