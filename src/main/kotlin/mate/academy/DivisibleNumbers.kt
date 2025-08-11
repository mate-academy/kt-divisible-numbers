package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray = numbers.filter { it.rem(divider) == 0 && it.div(divider) > 0 }.toIntArray()