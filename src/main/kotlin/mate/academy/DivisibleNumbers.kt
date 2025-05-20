package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val array = mutableListOf<Int>()
    for (number in numbers) {
        if (number % divider == 0 && number > 0) {
            array.add(number)
        }
    }
    return array.toIntArray()
}
