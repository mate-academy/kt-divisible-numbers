package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter{n -> n > 0 && n % divider == 0}.toIntArray()
}
