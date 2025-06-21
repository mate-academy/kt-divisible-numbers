package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val list = mutableListOf<Int>()
    for (number in numbers) {
        if (number % divider == 0 && number >= 0) list.add(number)
    }
    return list.toIntArray()
}
