package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val listInts = mutableListOf<Int>()
    for (number in numbers) {
        if (number % divider == 0 && number >= 0) listInts.add(number)
    }
    return listInts.toIntArray()
}
