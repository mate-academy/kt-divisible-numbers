package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val divisibleNumbers: MutableList<Int> = mutableListOf()
    for (number in numbers) {
        if (number % divider == 0 && number > 0) {
            divisibleNumbers.add(number)
        }
    }
    return divisibleNumbers.toIntArray()
}
