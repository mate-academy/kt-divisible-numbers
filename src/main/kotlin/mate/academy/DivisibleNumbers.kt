package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`
fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray =
    numbers.filter { it % divider == 0 && it > 0 }.toIntArray()

