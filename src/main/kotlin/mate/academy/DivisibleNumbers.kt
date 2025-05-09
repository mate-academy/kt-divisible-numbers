package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (number > 0 && number % divider == 0) {
            result.add(number)
        }
    }
    return result.toIntArray()
}
