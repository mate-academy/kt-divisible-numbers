package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    var res = mutableSetOf<Int>()
    numbers.forEach { if (it > 0 && it % divider == 0) res.add(it) }
    return res.toIntArray()
}
