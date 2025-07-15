package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    var divList : MutableList<Int> = mutableListOf()
    for (i in 0 until numbers.size) {
        if (numbers[i] % divider == 0 && numbers[i] > 0) divList.add(numbers[i])
    }
    return divList.toIntArray()
}
