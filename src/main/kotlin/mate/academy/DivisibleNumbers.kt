package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter { e -> e > 0 && e % divider == 0 }.toIntArray()
}
