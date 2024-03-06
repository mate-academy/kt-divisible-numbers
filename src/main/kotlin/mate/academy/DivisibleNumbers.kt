package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int) =
    numbers.filter { it > ZERO && it % divider == ZERO }.toIntArray()

const val ZERO = 0
