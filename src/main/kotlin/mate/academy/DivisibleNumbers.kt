package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val response = mutableListOf<Int>()
    numbers.forEach {
        if (it % divider == 0)
            response.add(it)
    }
    return response.toIntArray()
}
