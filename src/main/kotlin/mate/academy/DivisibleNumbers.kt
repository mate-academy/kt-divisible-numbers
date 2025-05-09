package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (number % divider == 0 && number > 0) {
            result.add(number)
        }
    }
    return result.toIntArray()
}
