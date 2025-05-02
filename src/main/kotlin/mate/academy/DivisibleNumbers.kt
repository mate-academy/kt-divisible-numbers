package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

private const val ZERO = 0

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    var listOfDivisibleNumbers = mutableListOf<Int>()

    for (number in numbers) {
        if (number > ZERO && number % divider == ZERO) {
            listOfDivisibleNumbers.add(number)
        }
    }

    return listOfDivisibleNumbers.toIntArray()
}
