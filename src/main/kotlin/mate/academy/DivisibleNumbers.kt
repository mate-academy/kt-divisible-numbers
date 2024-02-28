package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.toList().filter { e -> e % divider == 0 && e > 0 }.toIntArray()
}
