package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val listWithNumber : MutableList<Int> = mutableListOf()
    for (num in numbers) {
        if (num > 0 && num % divider == 0)
            listWithNumber.add(num)
    }
    return listWithNumber.toIntArray()
}
