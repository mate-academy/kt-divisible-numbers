package mate.academy

// Implement the function to return an array
// with only positive numbers that are evenly divisible by `divider`

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val list = mutableListOf<Int>()
    for (num in numbers) {
        if (num > 0 && num % divider == 0) {
            list.add(num)
        }
    }
    return list.toIntArray()
}
