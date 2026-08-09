package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val result = mutableSetOf<Int>()
    for (i in numbers.indices) {
        if (numbers[i] % divider == 0 && numbers[i] > 0) {
            result.add(numbers[i])
        }
    }
    return result.toIntArray()
}
