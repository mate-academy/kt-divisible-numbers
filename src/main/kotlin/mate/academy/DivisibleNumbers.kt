package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    var list: MutableList<Int> = mutableListOf<Int>()
    for (i in numbers.indices) {
        if (numbers[i] > 0 && numbers[i] % divider == 0) {
            list.add(numbers[i])
        }
    }
    return list.toIntArray()
}
